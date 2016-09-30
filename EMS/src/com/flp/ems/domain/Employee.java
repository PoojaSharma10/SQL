package com.flp.ems.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Employee implements Cloneable
{   
    private int EmployeeId=200,PhoneNo,DepartmentId,ProjectId,RolesId;
    private String Name,KinId,EmailId,Address;
    private Date DateOfBirth,DateOfjoining;
    private static int inc=0;
	public Employee() {
		super();
		inc++;
	}
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		} 
	@Override
	public int hashCode() {
		return this.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return this.EmployeeId==((Employee) obj).getEmployeeId();
	}

	public Employee(int phoneNo, int departmentId, int projectId, int rolesId, String name,
			String kinId,String address, Date dateOfBirth, Date dateOfjoining) {
		this();
		System.out.println("employee constructor called");
		EmployeeId=EmployeeId+inc;
		PhoneNo = phoneNo;
		DepartmentId = departmentId;
		ProjectId = projectId;
		RolesId = rolesId;
		Name = name;
		KinId = kinId;
		Address = address;
		DateOfBirth = dateOfBirth;
		DateOfjoining = dateOfjoining;
		EmailId = generateEmailId();
		System.out.println("employee constructed");
	}

	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public int getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}
	public int getDepartmentId() {
		return DepartmentId;
	}
	public void setDepartmentId(int departmentId) {
		DepartmentId = departmentId;
	}
	public int getProjectId() {
		return ProjectId;
	}
	public void setProjectId(int projectId) {
		ProjectId = projectId;
	}
	public int getRolesId() {
		return RolesId;
	}
	public void setRolesId(int rolesId) {
		RolesId = rolesId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getKinId() {
		return KinId;
	}
	public void setKinId(String kinId) {
		KinId = kinId;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Date getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}
	public Date getDateOfjoining() {
		return DateOfjoining;
	}
	public void setDateOfjoining(Date dateOfjoining) {
		DateOfjoining = dateOfjoining;
	}
    public String generateEmailId()
    {
    	String emailId=Name+".barclays"+EmployeeId+"@gmail.com";
    	return emailId;
    }
    
    
    
    
    
    
    
}
