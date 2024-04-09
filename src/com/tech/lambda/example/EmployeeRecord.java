package com.tech.lambda.example;
// Record cannot extend any other class. All Java records implicitly extend the Record class
public record EmployeeRecord (String name, int employeeNumber) {}
