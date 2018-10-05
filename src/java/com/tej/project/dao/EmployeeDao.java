/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tej.project.dao;

import com.tej.project.model.Employee;
import java.util.List;

/**
 *
 * @author wajid
 */
public interface EmployeeDao {
    public void save(Employee emp);
    public List<Employee> findAll();
    public void delete(Integer id);
    public Employee findById(Integer id);
    public void Update(Employee emp);
    public Employee search(Integer id);
}
