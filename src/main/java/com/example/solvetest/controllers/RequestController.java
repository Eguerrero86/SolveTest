package com.example.solvetest.controllers;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.solvetest.model.UserRequestModel;
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
    public String processCase(@RequestBody UserRequestModel userRequesModel) {

        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        UserCase userCase = modelMapper.map(userRequesModel, UserCase.class);
        UserCase userResponse = processCaseService.processCase(userCase);
        return null;
    }
}
