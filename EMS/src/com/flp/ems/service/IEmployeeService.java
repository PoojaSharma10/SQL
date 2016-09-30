package com.flp.ems.service;

import java.util.HashMap;

import com.flp.ems.domain.Employee;

public interface IEmployeeService {
	public void addEmployee(HashMap<String, Object> hashmap);
   
    public void modifyEmployee(int id,HashMap<String,Object> hashmap) throws CloneNotSupportedException;
   
    public void removeEmplyee(int id);
  
    
    public Employee searchEmployee(int id);
   
    public void showAllEmployee();
    
}
