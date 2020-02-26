package com.example.solvetest.services;

import org.springframework.stereotype.Service;

import com.example.solvetest.shared.TraceabilityRecord;

@Service
public class HandleTraceabilityServiceImpl implements HandleTraceabilityService {

	@Override
	public TraceabilityRecord createTraceabilityRecord(TraceabilityRecord traceabilityRecord) {
		System.out.println("se guarda el historial correctamente");
		return null;
	}

}
