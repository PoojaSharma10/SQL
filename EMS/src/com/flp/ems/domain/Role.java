package com.flp.ems.domain;

public class Role
{
   private int RoleId=13;
   private String Name="Software engineer",Description="Develop Software";
   
public Role() {
	super();
}

public Role(int roleId, String name, String description) {
	super();
	RoleId = roleId;
	Name = name;
	Description = description;
}

public int getRoleId() {
	return RoleId;
}

public void setRoleId(int roleId) {
	RoleId = roleId;
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
