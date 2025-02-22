package com.furkanyildirim.business.service.Impl;

import com.furkanyildirim.business.dto.AppointmentDTO;
import com.furkanyildirim.business.service.IAppointmentService;
import com.furkanyildirim.data.entity.Appointment;
import com.furkanyildirim.data.entity.Doctor;
import com.furkanyildirim.data.entity.Patient;
import com.furkanyildirim.data.repository.AppointmentRepository;
import com.furkanyildirim.data.repository.DoctorRepository;
import com.furkanyildirim.data.repository.PatientRepository;
import com.furkanyildirim.role.EStatus;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

//@RequiredArgsConstructor

@Service
@Component("appointmentService")
public class AppointmentService implements IAppointmentService<AppointmentDTO,Appointment> {

    private final AppointmentRepository appointmentRepository;
    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public AppointmentService(AppointmentRepository appointmentRepository,PatientRepository patientRepository,DoctorRepository doctorRepository,ModelMapper modelMapper) {
        this.appointmentRepository = appointmentRepository;
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
        this.modelMapper = modelMapper;
    }

    public AppointmentDTO entityToDto(Appointment appointment) {
        return modelMapper.map(appointment, AppointmentDTO.class);
    }

    public Appointment dtoToEntity(AppointmentDTO appointmentDTO) {
        return modelMapper.map(appointmentDTO, Appointment.class);
    }


    @Override
    public AppointmentDTO createAppointment(AppointmentDTO appointmentDTO) {
        Patient patient = patientRepository.findById(appointmentDTO.getPatientId())
                .orElseThrow(() -> new RuntimeException("Hasta bulunamadı"));

        Doctor doctor = doctorRepository.findById(appointmentDTO.getDoctorId())
                .orElseThrow(() -> new RuntimeException("Doktor bulunamadı"));

        Appointment appointment = dtoToEntity(appointmentDTO);
        appointment.setPatient(patient);
        appointment.setDoctor(doctor);

        Appointment savedAppointment = appointmentRepository.save(appointment);

        return entityToDto(savedAppointment);
    }

    @Override
    public Page<AppointmentDTO> getAllAppointments(Pageable pageable) {
        Page<Appointment> appointmentPage = appointmentRepository.findAll(pageable);
        Page<AppointmentDTO> appointmentDTOPage = appointmentPage.map(this::entityToDto);
        return appointmentDTOPage;
    }

    @Override
    public AppointmentDTO getAppointmentById(Long id) {
        return null;
    }

    @Override
    public List<AppointmentDTO> getAppointmentByStatus(EStatus status) {
        return List.of();
    }

    @Override
    public AppointmentDTO updateAppointment(Long id, AppointmentDTO appointmentDTO) {
        return null;
    }

    @Override
    public void deleteAppointment(Long id) {

    }

    @Override
    public void deleteAllAppointment() {

    }
}
