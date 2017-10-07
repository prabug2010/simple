package com.prabu.maven.simple;

public class User {

	public static void createUser()
	{

	IdClass id1 = new IdClass();
	id1.getId();
	
	UserName user = new UserName();
	user.getUserName();
	
	Dept dep = new Dept();
	dep.getDept();
	
	System.out.println(user.getUserName());
	System.out.println(id1.getId());
	System.out.println(dep.getDept());
	
	}
	
	public static void main(String args[])
	{
		createUser();
	}
}
