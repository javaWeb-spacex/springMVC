package com.sbx.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * @author :sbx
 * @date :2022/3/6 0:21
 * @description :
 * @version: :1.0.0
 */
@Controller
public class SharedDataController {

//    @RequestMapping("/sharedData")
//    public String sharedData(){
//        return "index";
//    }

    /**使用servletAPI向Request域对象共享数据*/
    @RequestMapping("/servlrtAPI")
    public String servlrtAPI(HttpServletRequest request){
        request.setAttribute("Request","servletAPI");
        return "success";
    }

    /**使用ModelAndView向request域对象共享数据*/
    @RequestMapping("/ModelAndView")
    public ModelAndView modelAndView(){
        /**
        * ModelAndView 有Model和View功能
         * Model主要向请求域中共享数据
         * View主要用于设置视图，实现页面跳转
        * */
        ModelAndView mv = new ModelAndView();
        //处理模型数据，即向Request请求域中共享数据
        mv.addObject("Request","ModelAndView");
        //设置视图名称
        mv.setViewName("success");
        return mv;
    }


    /**使用Model向request域对象共享数据*/
    @RequestMapping("/Model")
    public String model(Model model){
        model.addAttribute("Request","Model");
        System.out.println(model.getClass().getName());
        return "success";
    }

    /**使用Map向request域对象共享数据*/
    @RequestMapping("/Map")
    public String map(Map<String, Object> map){
        map.put("Request","Map");
        System.out.println(map.getClass().getName());
        return "success";
    }

    /**使用Map向request域对象共享数据*/
    @RequestMapping("/ModelMap")
    public String modelMap(ModelMap modelMap){
        modelMap.addAttribute("Request","ModelMap");
        System.out.println(modelMap.getClass().getName());
        return "success";
    }

    /**使用ServletAPI向session域对象共享数据*/
    @RequestMapping("/HttpSession")
    public String HttpSession(HttpSession session){
       session.setAttribute("session","Session");
        return "success";
    }

    /**使用ServletAPI向application域对象共享数据*/
    @RequestMapping("/Application")
    public String Application(HttpSession session){
        ServletContext servletContext = session.getServletContext();
        servletContext.setAttribute("application","Application");
        return "success";
    }
}
