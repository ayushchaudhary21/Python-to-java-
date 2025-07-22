package com.conertor.Python.to.java;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Model {
    private String pythonCode;
}

//A Model in Java (specifically in a Spring Boot application) is a POJO
// (Plain Old Java Object) used to represent and transport data across
// different layers of the application, such as between the Controller,
// Service, and View (or API client).

