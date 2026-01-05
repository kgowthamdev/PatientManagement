package com.zoro.patientmanagement.service;

import org.springframework.stereotype.Service;

import com.zoro.patientmanagement.repository.PatientRepository;

@Service
public class PatientService {

    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

}
