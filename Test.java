package com.hashmap;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        
        HashMap<String, List<String>> departmentMap = new HashMap<>();
        
        departmentMap.put("HR", Arrays.asList("Shubham", "Ravi"));
        departmentMap.put("IT", Arrays.asList("kartik", "ram"));
        departmentMap.put("Finance", Arrays.asList("Pooja", "Akshay"));
        departmentMap.put("Marketing", Arrays.asList("Avi", "Krish"));
        
        for (Map.Entry<String, List<String>> entry : departmentMap.entrySet()) 
        {
            String department = entry.getKey();
            List<String> employees = entry.getValue();
            
            for (String employee : employees) 
            {
                System.out.println("Employee: " + employee + " | Department: " + department);
            }
        }
    }
}
