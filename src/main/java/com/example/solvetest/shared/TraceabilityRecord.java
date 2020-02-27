package com.example.solvetest.shared;

import java.time.LocalDate;

public class TraceabilityRecord {
    private String cedula;
    private LocalDate date;

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

}
