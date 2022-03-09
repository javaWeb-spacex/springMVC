package com.sbx.Controller;

import com.sbx.bean.User;
import org.springframework.http.RequestEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :sbx
 * @date :2022/3/8 14:07
 * @description :
 * @version: :1.0.0
 */
@Controller
public class HttpMessageConverter {
    @RequestMapping("/RequestBody")
    public String RequestBody(@RequestBody String requestBody){
        System.out.println("RequestBody="+requestBody);
        return "success";
    }

    @RequestMapping("/RequestEntity")
    public String RequestEntity(RequestEntity<String> requestEntity){
        System.out.println("requestEntity="+requestEntity.getHeaders());
        System.out.println(requestEntity.getBody());
        return "success";
    }

    @RequestMapping(value = "/Response")
    public  void Response(HttpServletResponse response) throws IOException {
        response.setContentType("text/plain;charset=UTF-8");
        response.getWriter().println("张三 Response");
    }
    @RequestMapping(value = "/ResponseBody",produces = "text/plain;charset=UTF-8")
    @ResponseBody
    public  String ResponseBody() {
        return "李四";
    }
    @RequestMapping("/ResponseUser")
    @ResponseBody
    public User ResponseUser() {
        return new User(1,"王五","156",1);
    }


    @RequestMapping("/testAxios")
    @ResponseBody
    public String testAxios(String username,String password){
        System.out.println(username+","+password);
        return "hello,axios";
    }
}
