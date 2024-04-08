package com.example.springbootfirstproject.Controller;

import com.example.springbootfirstproject.Services.ApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HomeController {
    @Autowired
    ApiService apiService;

    @GetMapping("/home")
    public String home() throws IOException {
        String s = apiService.makeRequest("https://jsonplaceholder.typicode.com/todos/1");
        System.out.println(s);
        return s;
    }
}
