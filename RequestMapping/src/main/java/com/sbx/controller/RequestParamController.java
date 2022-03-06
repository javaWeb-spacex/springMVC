package com.sbx.controller;

import com.sbx.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Arrays;

/**
 * @author :sbx
 * @date :2022/3/5 18:20
 * @description :
 * @version: :1.0.0
 */
@Controller
public class RequestParamController {

    /**ServletAPI获取参数*/
    @RequestMapping("/servletAPI")
    public String servletAPI(HttpServletRequest request){
        //形参request表示当前请求
        //在响应报文中创建cookie
        HttpSession session = request.getSession();
        String id = request.getParameter("id");
        String username = request.getParameter("username");
        String[] hobbies = request.getParameterValues("hobby");
        System.out.println("id="+id+",username="+username+",hobby="+ Arrays.toString(hobbies));
        return "success";
    }

    /**形参获取请求参数*/
    @RequestMapping("/param")
    public String param(@RequestParam(value = "id",required = true,defaultValue = "3") String id, String username, String hobby
    , @CookieValue(value = "JSESSIONID")String name){
        //若请求中出现多个同名的请求参数，可以在控制器方法的形参位置设置字符串类型或字符串数组来接受此请求参数
        //若使用字符串类型的形参，最终结果为请求参数的每一个值之间使用逗号进行拼接
        System.out.println("id="+id+",username="+username+",hobby="+ hobby);
        System.out.println(name);
        return "success";
    }

    /**使用实体类结束请求参数*/
    @RequestMapping("/tesBean")
    public String tesBean(User user){
        System.out.println(user);
        return "success";
    }
}
