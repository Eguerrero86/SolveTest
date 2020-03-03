package com.example.solvetest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.solvetest.data.TraceabilityEntity;
import com.example.solvetest.repo.ITraceabilityRepo;
import com.example.solvetest.shared.UserCase;

@Service
public class HandleTraceabilityServiceImpl implements HandleTraceabilityService {
    @Autowired
    ITraceabilityRepo record;
    @Override
    public UserCase createTraceabilityRecord(UserCase userCase) {
        TraceabilityEntity execution = new TraceabilityEntity();
        execution.setCedula(userCase.getCedula());
        System.out.println(userCase.getDate());
        execution.setExecutionDate(userCase.getDate());
        record.save(execution);
        return null;
    }

}
