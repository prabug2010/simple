package com.prabu.maven.simple;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)

public class Employee {
	 
    private int empId;
    
    @JsonProperty("firstName")
    private String name;
    private String designation;
    private String department;
    private int salary;
     
    /*
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
    */
    public int getEmpId() {
        return empId;
    }
    @Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", designation=" + designation + ", department="
				+ department + ", salary=" + salary + "]";
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