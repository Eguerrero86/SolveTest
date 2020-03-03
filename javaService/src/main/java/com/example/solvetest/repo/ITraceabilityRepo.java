package com.example.solvetest.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.solvetest.data.TraceabilityEntity;

public interface ITraceabilityRepo extends JpaRepository<TraceabilityEntity, Long>{
}
