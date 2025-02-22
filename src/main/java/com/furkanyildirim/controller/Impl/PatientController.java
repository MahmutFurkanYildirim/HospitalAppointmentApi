package com.furkanyildirim.controller.Impl;


import com.furkanyildirim.business.dto.PatientDTO;
import com.furkanyildirim.data.entity.Patient;
import com.furkanyildirim.business.service.Impl.PatientService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public Page<PatientDTO> getAllPatients(Pageable pageable) {
        return patientService.getAllPatients(pageable);
    }

    @GetMapping("/{id}")
    public PatientDTO getPatientById(@PathVariable Long id) {
        return patientService.getPatientById(id);
    }

    @PostMapping
    public PatientDTO createPatient(@RequestBody PatientDTO patientDTO) {
        return patientService.createPatient(patientDTO);
    }

}
