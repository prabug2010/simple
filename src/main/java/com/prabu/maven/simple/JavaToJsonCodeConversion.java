package com.prabu.maven.simple;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonCodeConversion {

	public static void main(String a[]) {
        
        Employee2 emp = new Employee2();
        ObjectMapper mapperObj = new ObjectMapper();
         
        try {
            // get Employee object as a json string
            String jsonStr = mapperObj.writeValueAsString(emp);
            System.out.println(jsonStr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
}
