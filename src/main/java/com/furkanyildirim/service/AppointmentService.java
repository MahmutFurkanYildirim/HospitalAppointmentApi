package com.furkanyildirim.service;

import com.furkanyildirim.data.entity.Appointment;
import com.furkanyildirim.data.entity.Doctor;
import com.furkanyildirim.data.entity.Patient;
import com.furkanyildirim.data.repository.AppointmentRepository;
import com.furkanyildirim.data.repository.DoctorRepository;
import com.furkanyildirim.data.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    public AppointmentService(AppointmentRepository appointmentRepository, PatientRepository patientRepository, DoctorRepository doctorRepository) {
        this.appointmentRepository = appointmentRepository;
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
    }

    public Appointment createAppointment(Long patientId, Long doctorId, LocalDateTime appointmentDate) {
        Patient patient = patientRepository.findById(patientId).orElseThrow(() -> new RuntimeException("Patient not found"));
        Doctor doctor = doctorRepository.findById(doctorId).orElseThrow(() -> new RuntimeException("Doctor not found"));

        Appointment appointment = new Appointment();
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);
        appointment.setAppointmentDate(appointmentDate);

        return appointmentRepository.save(appointment);
    }
}
