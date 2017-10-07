package com.prabu.maven.simple;

public class EmpClass {

	    private String name;
	    private String designation;
	    private String department;
	    private int salary;
		private int empId;
	     
	    public String toString(){
	        StringBuilder sb = new StringBuilder();
	        sb.append("************************************");
	        sb.append("\nempId: ").append(empId);
	        sb.append("\nname: ").append(name);
	        sb.append("\ndesignation: ").append(designation);
	        sb.append("\ndepartment: ").append(department);
	        sb.append("\nsalary: ").append(salary);
	        sb.append("\n************************************");
	        return sb.toString();
	    }
	     
	    public int getEmpId() {
	        return getEmpId();
	    }
	    public void setEmpId(int empId) {
	        this.empId = empId;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public String getDesignation() {
	        return designation;
	    }
	    public void setDesignation(String designation) {
	        this.designation = designation;
	    }
	    public String getDepartment() {
	        return department;
	    }
	    public void setDepartment(String department) {
	        this.department = department;
	    }
	    public int getSalary() {
	        return salary;
	    }
	    public void setSalary(int salary) {
	        this.salary = salary;
	    }   
	}



