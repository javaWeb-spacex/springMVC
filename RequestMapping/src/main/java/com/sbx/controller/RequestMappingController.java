package com.sbx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author :sbx
 * @date :2022/3/5 11:32
 * @description :
 * @version: :1.0.0
 */
@Controller
@RequestMapping("/test")
public class RequestMappingController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping(
            value = {"/success","/successTest"},
            method = {RequestMethod.GET,RequestMethod.POST}
    )
    public String success(){
        return "success";
    }


    @RequestMapping(
            value = {"/paramsAndHeaders"},
            method = {RequestMethod.GET,RequestMethod.POST}
            ,params = {"username","password!=123"}
            ,headers = {"Host=localhost:8080","Accept"}
    )
    public String paramsAndHeaders(){
        return "paramsAndHeaders";
    }


    /**Restful*/
    @RequestMapping("/testPath/{id}")
    public String restful(@PathVariable("id") Integer id){
        System.out.println("id="+id);
        return "success";
    }
    /**获取请求参数*/
    @RequestMapping("/requestParam")
    public String requestParam(){
        return "RequestParam";
    }
}
