package com.flp.ems.service;

import java.util.Date;
import java.util.HashMap;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService{
	//HashMap<String, Object> hashmap;
	EmployeeDaoImplForList employeeDaoImplForList;
	
	public EmployeeServiceImpl() {
		super();
		employeeDaoImplForList = new EmployeeDaoImplForList();
		}
	/*public EmployeeServiceImpl(HashMap<String, Object> hashmap)
	{   this();
		System.out.println("hashmap initialsed");
		this.hashmap=hashmap;
	  addEmployee();
	}*/
	public void addEmployee(HashMap<String, Object> hashmap)
    { System.out.println("service layer called");
    	Employee employee=new  Employee(
    			//(int)hashmap.get("EmployeeId"),
    			(int)hashmap.get("PhoneNo"),
    			(int)hashmap.get("DepartmentId"),
    			(int)hashmap.get("ProjectId"),
    			(int) hashmap.get("RolesId"),
    			(String)  hashmap.get("Name"),
    			 (String)hashmap.get("KinId"),
    			//(String)hashmap.get("EmailId"),
    		(String)hashmap.get("Address"),
    		(Date)hashmap.get("DateOfBirth"),
    		 (Date)hashmap.get("DateOfjoining"));
    	System.out.println("service added element");
    	
    	employeeDaoImplForList.addEmployee(employee);
    	
    }
    public void modifyEmployee(int employeeId,HashMap<String, Object>hashmap) throws CloneNotSupportedException
    { Employee employee=employeeDaoImplForList.getCloneObject(employeeId);
      if(employee.getEmployeeId()!=employeeId)
      {
    	  System.out.println("erro");
    	  return ;
      }
     if(hashmap.get("PhoneNo")!=null) 
      employee.setPhoneNo((int)hashmap.get("PhoneNo"));
     if(hashmap.get("DepartmentId")!=null) 
      employee.setDepartmentId((int)hashmap.get("DepartmentId"));
     if(hashmap.get("ProjectId")!=null) 
      employee.setProjectId((int)hashmap.get("ProjectId"));
     if(hashmap.get("RolesId")!=null) 
      employee.setRolesId((int) hashmap.get("RolesId"));
     /*if(hashmap.get("Name")!=null) 
      employee.setName((String)  hashmap.get("Name"));*/
     /*if(hashmap.get("KinId")!=null) 
		employee.setKinId((String)hashmap.get("KinId"));*/
     /*if(hashmap.get("EmailId")!=null) 
		employee.setEmailId((String)hashmap.get("EmailId"));*/
     if(hashmap.get("Address")!=null) 
		employee.setAddress((String)hashmap.get("Address"));
     if(hashmap.get("DateOfBirth")!=null) 
		employee.setDateOfBirth((Date)hashmap.get("DateOfBirth"));
   /*  if(hashmap.get("DateOfjoining")!=null) 
		employee.setDateOfjoining((Date)hashmap.get("DateOfjoining"));*/
    
     employeeDaoImplForList.modifyEmployee(employeeId,employee);
    }
    public void removeEmplyee(int employeeId)
    {  Employee employee=searchEmployee(employeeId);
      if(employee!=null)
    	employeeDaoImplForList.removeEmplyee(employee);
    }
    
    public Employee searchEmployee(int employeeId)
    {  System.out.println("in service");
    Employee employee= employeeDaoImplForList.searchEmployee(employeeId);
    System.out.println("back in service");
    return employee;
    }
    public void showAllEmployee()
    {
    	employeeDaoImplForList.showAllEmployee();
    }
}
