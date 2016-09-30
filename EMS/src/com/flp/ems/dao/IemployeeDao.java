package com.flp.ems.dao;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {
	public void addEmployee(Employee employee);
	   
    public void modifyEmployee(int id,Employee employee);
   
    public void removeEmplyee(Employee employee);
  
    
    public Employee searchEmployee(int id);
   
    public void showAllEmployee();
}
