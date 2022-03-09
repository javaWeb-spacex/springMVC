package com.sbx.Controller;

import com.sbx.bean.Employee;
import com.sbx.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * @author :sbx
 * @date :2022/3/8 10:43
 * @description :
 * @version: :1.0.0
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping("/employee")
    public String getAllEmployee(Model model){
        Collection<Employee> employeeList = employeeDao.getAll();
        model.addAttribute("employeeList",employeeList);
        return "employeeList";
    }
    @GetMapping("/employee/{id}")
    public String getEmployeeById(@PathVariable("id") Integer id,Model model){
        Employee employee = employeeDao.get(id);
        model.addAttribute("employee",employee);
        return "employee_update";
    }

    @DeleteMapping("/employee/{id}")
    public String deleteEmployee(@PathVariable("id") Integer id){
        employeeDao.delete(id);
        return "redirect:/employee";
    }
    @PostMapping("/employee")
    public  String addEmployee(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }


    @PutMapping("/employee")
    public String getEmployeeById(Employee employee){
        employeeDao.save(employee);
        return "redirect:/employee";
    }

}
