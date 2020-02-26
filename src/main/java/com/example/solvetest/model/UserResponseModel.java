package com.example.solvetest.model;

import java.util.ArrayList;

public class UserResponseModel {
	private String cedula;
	private ArrayList<String> outputCase;
	
	public UserResponseModel(String cedula, ArrayList<String> outputCase) {
		this.cedula = cedula;
		this.outputCase = outputCase;
	}
}
