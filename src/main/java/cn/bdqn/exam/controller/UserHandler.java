package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.User;
import cn.bdqn.exam.server.UserService;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.util.concurrent.TimeUnit;

@Controller
@RequestMapping("/user")
public class UserHandler {
    @Autowired
    private UserService userService;

    @Autowired
    DefaultKaptcha defaultKaptcha;

    @Resource
    private RedisTemplate<Object, Object> redisTemplate;

    @GetMapping("/view")
    public String toLogin() {
        return "login";
    }

    @PostMapping("/doLogin")
    @ResponseBody
    public Integer doLogin(User user) {
        User login = userService.Login(user.getAccount().trim(), user.getPassword().trim());
        System.out.println(user.getAccount().trim()+ user.getPassword().trim());
        redisTemplate.opsForValue().set("user", user, 60*60, TimeUnit.SECONDS);

        User u = (User) redisTemplate.opsForValue().get("user");
        if (login != null) {
            return 1;
        }
        return 0;
    }


    @RequestMapping("/defaultKaptcha")
    public void defaultKaptcha(HttpServletRequest request, HttpServletResponse response) throws Exception {
        byte[] captchaChallengeAsJpeg = null;
        ByteArrayOutputStream jpegOutputStream = new ByteArrayOutputStream();
        try {
            String createText = defaultKaptcha.createText();
            redisTemplate.opsForValue().set("verifyCode", createText, 20, TimeUnit.SECONDS);
            BufferedImage challenge = defaultKaptcha.createImage(createText);
            ImageIO.write(challenge, "jpg", jpegOutputStream);
        } catch (IllegalArgumentException e) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
            return;
        }
        captchaChallengeAsJpeg = jpegOutputStream.toByteArray();
        response.setHeader("Cache-Control", "no-store");
        response.setHeader("Pragma", "no-cache");
        response.setDateHeader("Expires", 0);
        response.setContentType("image/jpeg");
        ServletOutputStream responseOutputStream =
                response.getOutputStream();
        responseOutputStream.write(captchaChallengeAsJpeg);
        responseOutputStream.flush();
        responseOutputStream.close();
    }

    @GetMapping("/verifyCode/{verification}")
    @ResponseBody
    public Integer imgverifyControllerDefaultKaptcha(HttpSession session, @PathVariable("verification") String verifyCode) {
        String captchaId = (String) redisTemplate.opsForValue().get("verifyCode");
        if (!captchaId.equals(verifyCode)) {
            return 0;
        }
        System.out.println("输入正确");
        return 1;
    }

    @GetMapping("/quit")

    public String quit() {

        redisTemplate.delete("user");

        return "login";

    }

}
