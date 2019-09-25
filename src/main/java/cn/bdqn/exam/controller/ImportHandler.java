package cn.bdqn.exam.controller;

import cn.bdqn.exam.entity.Test;
import cn.bdqn.exam.server.TestService;
import cn.bdqn.exam.util.ImportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/import")
public class ImportHandler {

    @Autowired
    private ImportService importService;

    @Autowired
    private TestService testService;


    @GetMapping("/toAddMultiTest")
    public String AddMultiTest() {
        return "AddMultiTest";
    }

    @Value("${excel.fileName}")
    private String fileName;

    @Value("${excel.filePath}")
    private String filePath;

    @GetMapping("/downloadLocal")
    public void downloadLocal(HttpServletResponse response) throws FileNotFoundException {
        InputStream inStream = new FileInputStream(filePath + fileName);// 文件的存放路径
        // 设置输出的格式
        response.reset();
        response.setContentType("bin");
        response.addHeader("Content-Disposition", "attachment; filename=" + fileName + "");
        // 循环取出流中的数据
        byte[] b = new byte[100];
        int len;
        try {
            while ((len = inStream.read(b)) > 0)
                response.getOutputStream().write(b, 0, len);
            inStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @PostMapping(value = "/addMultiTest")
    public String uploadExcel(HttpServletRequest request, Map<String, String> map) throws Exception {
        MultipartHttpServletRequest multipartRequest = (MultipartHttpServletRequest) request;

        MultipartFile file = multipartRequest.getFile("filename");
        if (file.isEmpty()) {
            map.put("hint", "上传文件不能为空!!!");
            return "AddMultiTest";
        }
        InputStream inputStream = file.getInputStream();
        System.out.println(file.getOriginalFilename());
        List<Test> bankListByExcel = importService.getBankListByExcel(inputStream, file.getOriginalFilename());
        inputStream.close();
        for (int i = 0; i < bankListByExcel.size(); i++) {
            if(bankListByExcel.get(i) != null){
                testService.addTest(bankListByExcel.get(i));
            }
        }

        return "picture-list";
    }



}
