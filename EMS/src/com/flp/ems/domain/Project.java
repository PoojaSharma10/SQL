package com.flp.ems.domain;

public class Project
{
   private int ProjectId=12,DepartmentId;
   private String Name="EMS",Description="EmployeeManagementSystem";
   
public Project() {
	super();
}

public Project(int projectId, int departmentId, String name, String description) {
	super();
	ProjectId = projectId;
	DepartmentId = departmentId;
	Name = name;
	Description = description;
}

public int getProjectId() {
	return ProjectId;
}
public void setProjectId(int projectId) {
	ProjectId = projectId;
}
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
   
}
