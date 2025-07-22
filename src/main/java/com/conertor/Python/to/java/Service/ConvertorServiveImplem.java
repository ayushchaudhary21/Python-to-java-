package com.conertor.Python.to.java.Service;

import org.springframework.stereotype.Service;


@Service
public class ConvertorServiveImplem implements ConverterService {

    @Override
    public String convertPythonToJava(String pythonCode) {
        if (pythonCode == null || pythonCode.isBlank()) {
            return "No Python code received.";
        }

        // STEP 1: Convert function definition
        String converted = pythonCode.replaceAll("def (\\w+)\\s*\\(\\):", "public void $1() {");

        // STEP 2: Convert print() inside functions
        converted = converted.replaceAll("print\\((.*?)\\)", "System.out.println($1)");

        // STEP 3: Replace Python indentation (optional — can be improved)
        converted = converted.replaceAll("(?m)^\\s{4}", "    "); // optional basic indent fix

        // STEP 4: Add closing brace
        converted += "\n}";

        return converted;
    }
}

