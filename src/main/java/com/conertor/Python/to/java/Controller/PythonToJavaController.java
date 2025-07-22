package com.conertor.Python.to.java.Controller;

import com.conertor.Python.to.java.Model;
import com.conertor.Python.to.java.Service.ConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convert")
public class PythonToJavaController {

    @Autowired
    private ConverterService converterService;

    @PostMapping
    public ResponseEntity<String> convert(@RequestBody Model model) {
        String javaCode = converterService.convertPythonToJava(model.getPythonCode());
        return ResponseEntity.ok(javaCode);
    }
}
