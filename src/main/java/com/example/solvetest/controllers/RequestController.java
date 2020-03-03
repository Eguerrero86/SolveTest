package com.example.solvetest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.solvetest.model.UserRequestModel;
import com.example.solvetest.model.UserResponseModel;
import com.example.solvetest.services.ProcessCaseService;
import com.example.solvetest.shared.UserCase;

@RestController
@RequestMapping("/solvetest")
public class RequestController {

    @Autowired
    private Environment env;

    @Autowired
    ProcessCaseService processCaseService;

    @GetMapping("/status/check")
    public String status() {
        return "working in the port " + env.getProperty("local.server.port");
    }

    @PostMapping("/process/case")
    public ResponseEntity<UserResponseModel> processCase(@RequestBody UserRequestModel userRequesModel) {

        UserCase userCase = new UserCase(userRequesModel.getCedula(), userRequesModel.getInputCase());
        UserCase userResponse = processCaseService.processCase(userCase);
        UserResponseModel reponse = new UserResponseModel(userResponse.getCedula(), userResponse.getOutputCase());
        
        return ResponseEntity.status(HttpStatus.CREATED).body(reponse);
    }
}
