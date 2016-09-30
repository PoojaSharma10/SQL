package com.flp.ems.domain;

public class Department 
{  private int DepartmentId=11;
   private String Name="Barclaycard";
   private String Description="Development";
public int getDepartmentId() {
	return DepartmentId;
}
public void setDepartmentId(int departmentId) {
	DepartmentId = departmentId;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public Department() {
	super();
}
public Department(int departmentId, String name, String description) {
	super();
	DepartmentId = departmentId;
	Name = name;
	Description = description;
}
   
}
