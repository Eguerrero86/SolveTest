package com.example.solvetest.model;

import java.util.ArrayList;

public class UserRequestModel {
	private String cedula;
	private ArrayList<String> inputCase;
	
	public UserRequestModel(String cedula, ArrayList<String> inputCase) {
		this.cedula = cedula;
		this.inputCase = inputCase;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public ArrayList<String> getInputCase() {
		return inputCase;
	}

	public void setInputCase(ArrayList<String> inputCase) {
		this.inputCase = inputCase;
	}
	
}
