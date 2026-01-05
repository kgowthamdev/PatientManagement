package com.zoro.patientmanagement.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zoro.patientmanagement.model.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {

}
