/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tej.project.service;

import com.tej.project.dao.EmployeeDao;
import com.tej.project.model.Employee;
import com.tej.project.util.HibernateUtil;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author wajid
 */
public class EmployeeService implements EmployeeDao{
    private SessionFactory sessionFactory;
    //Session session = HibernateUtil.getSessionFactory().openSession();
    List<Employee> AllEmployees;
    @Override
    public void save(Employee emp) {
        Session session = HibernateUtil.getSessionFactory().openSession();
         Transaction t =  session.beginTransaction();
         //Query query = session.createQuery("");
         System.out.println("User data is :"+emp.getFname());
         session.save(emp);
         t.commit();
    }

    @Override
    public List<Employee> findAll() {
        try
        {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            AllEmployees = session.createQuery("from Employee").list();
            //model.addAttribute("users", AllUsers);
            int count = AllEmployees.size();  
            System.out.println("No of Record From Dao: " + count);  
            System.out.println("First Name === "+AllEmployees.get(2));
            
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            
        }
        return AllEmployees;
    }

    @Override
    public void delete(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();  
        try  
        {
            EmployeeDao empDao = new EmployeeService();
            Employee emp = empDao.findById(id);
            Transaction t = session.beginTransaction();  
            session.delete(emp); 
            t.commit();
        }  
        catch (Exception e)  
        {  
            e.printStackTrace();  
            //session.getTransaction().rollback();  
        }  
        session.close(); 
    }

    @Override
    public void Update(Employee emp) {
        Session session = HibernateUtil.getSessionFactory().openSession();  
        try  
        {  
            session.beginTransaction();  
            session.update(emp);  
            session.flush();  
            session.getTransaction().commit();  
        }  
        catch (Exception e)  
        {  
            e.printStackTrace();
            e.getMessage();
        }  
        session.close();  
    }

    @Override
    public Employee findById(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
	criteria.add(Restrictions.eq("id", id));
        Employee employee = (Employee) criteria.uniqueResult();
        if (employee!=null) {
            System.out.println("Employee found:");
	    System.out.println(employee.getId() + " - " + employee.getFname());
            
        }
        session.getTransaction().commit();
        return employee;
    }

    @Override
    public Employee search(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Criteria criteria = session.createCriteria(Employee.class);
	criteria.add(Restrictions.eq("id", id));
        Employee employee = (Employee) criteria.uniqueResult();
        if (employee!=null) {
            System.out.println("Employee found:");
	    System.out.println(employee.getId() + " - " + employee.getFname());
            
        }
        session.getTransaction().commit();
        return employee;
    }
}
