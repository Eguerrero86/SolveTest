package com.example.solvetest.model;

import java.util.List;

public class UserResponseModel {
    private String cedula;
    private List<String> outputCase;

    public UserResponseModel(String cedula, List<String> outputCase) {
        this.cedula = cedula;
        this.outputCase = outputCase;
    }

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public List<String> getOutputCase() {
		return outputCase;
	}

	public void setOutputCase(List<String> outputCase) {
		this.outputCase = outputCase;
	}
    
}
