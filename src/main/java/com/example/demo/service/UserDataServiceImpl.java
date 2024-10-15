package com.example.demo.service;

import com.example.demo.entity.UserData;
import com.example.demo.repository.UserDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserDataServiceImpl implements UserDataService{

    //get the repository bean
    @Autowired
    UserDataRepository userDataRepository;

    //we use the repository bean to get access to all the methods
    //like findAll
    @Override
    public List<UserData> getUserData() {
        return userDataRepository.findAll();
    }
}