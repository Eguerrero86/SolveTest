package com.example.solvetest.services;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.solvetest.shared.UserCase;

@Service
public class ProcessCaseServiceImpl implements ProcessCaseService {

    @Autowired
    HandleTraceabilityService handleTraceabilityService;

    @Autowired
    GetBestScenarioService getBestScenarioService;

    @Override
    public UserCase processCase(UserCase userCase) {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);

        handleTraceabilityService.createTraceabilityRecord(userCase);
        UserCase responseCase = getBestScenarioService.getBestScenario(userCase);

        return responseCase;
    }

}
