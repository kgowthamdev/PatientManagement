package Mapper;

import com.zoro.patientmanagement.dto.PatientResponseDTO;
import com.zoro.patientmanagement.model.Patient;

public class PatientMapper {

    public static PatientResponseDTO tdDto (Patient patient){
        PatientResponseDTO dto = new PatientResponseDTO();
        dto.setId(patient.getId().toString());
        dto.setName(patient.getName());
        dto.setAddress(patient.getAddress());
        dto.setEmail(patient.getEmail());
        dto.setDate_of_birth(patient.getDate_of_birth().toString());
        return dto; 
    }
}
