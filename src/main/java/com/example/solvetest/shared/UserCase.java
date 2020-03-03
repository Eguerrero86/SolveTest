package com.example.solvetest.shared;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

public class UserCase {
    private String cedula;
    private LocalDateTime date;
    private List<String> inputCase;
    private List<String> outputCase;
    
    public UserCase(String cedula,  List<String> inputCase) {
    	this.cedula = cedula;
    	this.inputCase = inputCase;
    	this.date = LocalDateTime.now().with(LocalTime.now());
    }
    
    public String getCedula() {
        return cedula;
    }
    
    public LocalDateTime getDate() {
        return date;
    }

    public List<String> getInputCase() {
        return inputCase;
    }
    
    public List<String> getOutputCase() {
        return outputCase;
    }
    
    public void setOutputCase(List<String> outputCase) {
        this.outputCase = outputCase;
    }

}
