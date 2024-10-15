package com.example.demo.api;

import com.example.demo.entity.UserData;
import com.example.demo.service.UserDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
//localhost:8080/api/v1
@RequestMapping("api/v1")
public class Controller {

    @Autowired
    private UserDataService userDataService;

    @GetMapping("/getdata")
    public List<UserData> getData(){
        return userDataService.getUserData();
    }
}
