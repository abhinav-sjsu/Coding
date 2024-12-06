package com.tech.lambda.example;

import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;

public class PrettyJsonPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String json = "{ \"name\": \"John\", \"age\": 30, \"city\": \"New York\" }";
        System.out.println("Original JSON:");
        System.out.println(json);
        System.out.println("\nPretty Printed JSON:");
        
        String prettyJson = prettyPrintJson(json);
        System.out.println(prettyJson);

	}
	
	public static String prettyPrintJson(String json) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            Object jsonObject = mapper.readValue(json, Object.class);
            ObjectWriter writer = mapper.writerWithDefaultPrettyPrinter();
            return writer.writeValueAsString(jsonObject);
        } catch (Exception e) {
            e.printStackTrace();
            return json;
        }
    }

}
