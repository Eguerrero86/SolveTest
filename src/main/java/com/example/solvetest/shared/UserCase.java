package com.example.solvetest.shared;

import java.time.LocalDate;
import java.util.ArrayList;

public class UserCase {
	private String cedula;
	private LocalDate date;
	private ArrayList<String> inputCase;
	private String outputCase;
	
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getOutputCase() {
		return outputCase;
	}
	public void setOutputCase(String outputCase) {
		this.outputCase = outputCase;
	}
	public ArrayList<String> getInputCase() {
		return inputCase;
	}
	public void setInputCase(ArrayList<String> inputCase) {
		this.inputCase = inputCase;
	}
	
}
