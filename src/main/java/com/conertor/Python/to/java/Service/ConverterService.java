package com.conertor.Python.to.java.Service;

import org.springframework.stereotype.Service;

@Service
public interface ConverterService {
    String convertPythonToJava(String pythonCode);
}
