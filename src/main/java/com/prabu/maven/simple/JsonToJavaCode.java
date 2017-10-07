package com.prabu.maven.simple;

import java.io.File;

import java.io.IOException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonToJavaCode {
	     
	    public static void main(String args[]){
	         
	        ObjectMapper mapper = new ObjectMapper();
	        Employee emp = new Employee();
	        try {
	            File jsonInputFile = new File("E:\\jsonInput1.txt");
	             emp =  mapper.readValue(jsonInputFile, Employee.class);
	            System.out.println(emp);
	             
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
	}