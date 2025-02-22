package com.furkanyildirim.business.service.Impl;

import com.furkanyildirim.business.dto.PatientDTO;
import com.furkanyildirim.business.service.IPatientService;
import com.furkanyildirim.data.entity.Patient;
import com.furkanyildirim.data.repository.PatientRepository;
//import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


//@RequiredArgsConstructor

@Service
@Component("patientService")
public class PatientService implements IPatientService<PatientDTO,Patient> {

    private final PatientRepository patientRepository;
    private final ModelMapper modelMapper;

    public PatientService(PatientRepository patientRepository,ModelMapper modelMapper) {
        this.patientRepository = patientRepository;
        this.modelMapper = modelMapper;
    }

    public PatientDTO entityToDto(Patient patient) {
        return modelMapper.map(patient, PatientDTO.class);
    }

    public Patient dtoToEntity(PatientDTO patientDTO) {
        return modelMapper.map(patientDTO, Patient.class);
    }

    @Override
    public PatientDTO createPatient(PatientDTO patientDTO) {
        Patient patient = dtoToEntity(patientDTO);
        Patient savedPatient = patientRepository.save(patient);
        return entityToDto(savedPatient);
    }

    @Override
    public Page<PatientDTO> getAllPatients(Pageable pageable) {

        Page<Patient> patientPage = patientRepository.findAll(pageable);
        Page<PatientDTO> patientDTOPage = patientPage.map(this::entityToDto);

        return patientDTOPage;
    }

    @Override
    public PatientDTO getPatientById(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        return entityToDto(patient);
    }

    @Override
    public PatientDTO updatePatient(Long id, PatientDTO patientDTO) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        patient.setName(patientDTO.getName());
        patient.setEmail(patientDTO.getEmail());
        Patient updatedPatient = patientRepository.save(patient);
        return entityToDto(updatedPatient);
    }

    @Override
    public void deletePatient(Long id) {
        Patient patient = patientRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patient not found"));
        patientRepository.delete(patient);
    }

    @Override
    public void deleteAllPatients() {
        patientRepository.deleteAll();
    }


}
