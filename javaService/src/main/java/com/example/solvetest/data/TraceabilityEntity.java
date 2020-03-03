package com.example.solvetest.data;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Traceability")
public class TraceabilityEntity {
	
	@Id
	@GeneratedValue
	private long id;
	
	@Column(nullable = false, length = 15)
	private String cedula;
	
	@Column(nullable = false, length = 30)
	private LocalDateTime executionDate;

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public LocalDateTime getExecutionDate() {
		return executionDate;
	}

	public void setExecutionDate(LocalDateTime executionDate) {
		this.executionDate = executionDate;
	}
	
	
}
