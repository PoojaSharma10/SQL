package com.flp.ems.dao;
import java.util.ArrayList;

import com.flp.ems.domain.Employee;

import javafx.scene.control.TableCellBuilder;
public class EmployeeDaoImplForList implements IemployeeDao {
	private ArrayList<Employee> employeelist;
	public EmployeeDaoImplForList() {
		super();
		employeelist=new ArrayList<Employee>();
	}
	public void addEmployee(Employee employee)
    {
    	employeelist.add(employee);
    	System.out.println("employee added successfully :");
    	System.out.println("EmployeeId       EmailId       Name       RolesId      DepartmentId     ProjectId\n");
    	for(Employee e:employeelist)
    	{  System.out.println("working");
    		System.out.println(e.getEmployeeId()+"  "+e.getEmailId()+"  "+e.getName()+"  "+e.getRolesId()+"  "+e.getDepartmentId()+"  "+e.getProjectId());
    	}
    }
    public Employee getCloneObject(int employeeId) throws CloneNotSupportedException
    {
    	Employee employee=null;
        for(Employee e:employeelist)
    	{
    		if(e.getEmployeeId()==employeeId)
    			employee=(Employee)e.clone();
    	}
        
        return employee;
    }
	public void modifyEmployee(int employeeId,Employee employee)
    { int index=0;
      Employee temp;
		for(;index<employeelist.size();index++)
		{
			temp=employeelist.get(index);
			if(temp.getEmployeeId()==employeeId)
			{ employeelist.set(index, employee);
			  System.out.println("employee modified");
			  break;
				
			}
		}
    	
    }
    public void removeEmplyee(Employee employee)
    {
    	boolean b=employeelist.remove(employee);
    	if(b)
    		System.out.println("Employee successfully removed");
    	else
    		System.out.println("something went wrong in Dao Layer");
    }
    
    public Employee searchEmployee(int employeeId)
    {    Employee employee=null;
    System.out.println("in Dao");
    for(Employee e:employeelist)
	{   
		if(e.getEmployeeId()==employeeId)
		{	employee=e;System.out.println("found");break;}
	}
    	return employee;
    }
    public void showAllEmployee()
    {    System.out.println("Employee List :\n");
         //TableBuilder 
         System.out.println("EmployeeId      EmailId       Name       RolesId      DepartmentId     ProjectId\n");
    	for(Employee e:employeelist)
    	{  System.out.println("working");
    		System.out.println(e.getEmployeeId()+"  "+e.getEmailId()+"  "+e.getName()+"  "+e.getRolesId()+"  "+e.getDepartmentId()+"  "+e.getProjectId());
    	}
    }
	
}
