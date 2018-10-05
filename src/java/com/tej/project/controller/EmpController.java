/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tej.project.controller;

import com.tej.project.dao.EmployeeDao;
import com.tej.project.model.Employee;
import com.tej.project.service.EmployeeService;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.portlet.ModelAndView;

/**
 *
 * @author wajid
 */
@Controller
public class EmpController {
    EmployeeDao empService = new EmployeeService();
    
    @RequestMapping("/sucess")
    public String sucess()
    {
        return "sucess";
    }
    @RequestMapping("/error")
    public String error()
    {
        return "error";
    }
    @RequestMapping(value="/index")
    public String index(ModelAndView model)
    { 
        return "index";
    }
    
    @RequestMapping(value="/Employees" , method = RequestMethod.GET)
    public String findAllUser(Model model,@ModelAttribute("Employee")Employee emp){
        List<Employee> employees = empService.findAll();
        model.addAttribute("employees", employees);
        return "Employees";
    }
    
    
    @RequestMapping(value= "/index", method = RequestMethod.POST)
    public String save(@ModelAttribute("emp") Employee emp,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        //Table = new newTable();
        try
        {
            empService.save(emp);
            return "redirect:/Employees.htm";
            
        }
        catch(Exception e)
        {
//           RequestDispatcher view = request.getRequestDispatcher("error.htm");
//           view.forward(request, response);
            return "redirect:/index.htm";
        }
        
    }
    
    
    @RequestMapping(value="/edit")
    public String edit(Model model,Employee emp,@RequestParam int id){
        emp = empService.findById(id);
        System.out.println("Id is :"+ emp.getId());
        model.addAttribute("id", emp.getId());
        model.addAttribute("fname", emp.getFname());
        model.addAttribute("lname", emp.getLname());
        model.addAttribute("designation", emp.getDesignation());
        model.addAttribute("salary", emp.getPay());
        model.addAttribute("department", emp.getDepartment());
        return "edit";
    }
    
    @RequestMapping(value="/update", method = RequestMethod.POST)
    public String update() throws ServletException, IOException
    {
        try
        {
            //empService.Update(emp);
            return "update";
            
        }
        catch(Exception e)
        {
            e.printStackTrace();
//            RequestDispatcher view = request.getRequestDispatcher("error.htm");
//            view.forward(request, response);
            return "error";
            
        }
        
    }
    
    @RequestMapping(value = "/search", method= RequestMethod.GET)
    public String search(){
        return "search";
    }
    
    @RequestMapping(value="/delete")
    public void delete(Employee emp,@RequestParam int id,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException
    {
        empService.delete(id);
        System.err.println("Data Deleted");
        RequestDispatcher view = request.getRequestDispatcher("Employees.htm");
        view.forward(request, response);
    }
    
    @RequestMapping(value = "/searchResult", method = RequestMethod.GET)
    public String searchResult(Model model,Employee emp,@RequestParam int id){
        emp = empService.findById(id);
        System.out.println("Id is :"+ emp.getId());
        model.addAttribute("id", emp.getId());
        model.addAttribute("fname", emp.getFname());
        model.addAttribute("lname", emp.getLname());
        model.addAttribute("designation", emp.getDesignation());
        model.addAttribute("salary", emp.getPay());
        model.addAttribute("department", emp.getDepartment());
        return "searchResult";
        
    }
}
