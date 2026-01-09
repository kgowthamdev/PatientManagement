package com.zoro.patientmanagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zoro.patientmanagement.dto.PatientResponseDTO;
import com.zoro.patientmanagement.model.Patient;
import com.zoro.patientmanagement.repository.PatientRepository;
import Mapper.PatientMapper;

@Service
public class PatientService {

    // instance variable
    private PatientRepository patientRepository;

    // constructor injection
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    // method to find getpatient
    public List<PatientResponseDTO> getPatients() {
        List<Patient> patients = patientRepository.findAll();

        // map to dto ( carry data from one layer to anothe) entity - how data is stored
        // dto - how data is shared and in
        // dto represent data sends out of appliction . dto is designed for api
        // responsedto is for communicating with client
        List<PatientResponseDTO> patientResponseDTOs = patients.stream().map(patient -> PatientMapper.tdDto(patient))
                .toList();

        return patientResponseDTOs;
    }

}
