package cn.bdqn.exam.util.intercepors;

import cn.bdqn.exam.entity.User;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class LoginInterceptor implements HandlerInterceptor {

    @Resource
    private RedisTemplate<Object, User> redisTemplate;

    private static final String LOGIN_URL = "/user/view";
    private static final String LOGIN_SUCCESS = "/toIndex";
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        User user = (User) redisTemplate.opsForValue().get("user");
        if (user == null) {
            response.sendRedirect(LOGIN_URL);
            return false;
        } else {
//            response.sendRedirect(LOGIN_SUCCESS);
            return true;
        }
    }
}
