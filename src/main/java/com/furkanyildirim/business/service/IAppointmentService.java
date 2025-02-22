package com.furkanyildirim.business.service;

import com.furkanyildirim.role.EStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

//D: Dto
//E: Entity
public interface IAppointmentService<D,E> {
    public D entityToDto(E e);
    public E dtoToEntity(D d);

    public D createAppointment(D d);

    public Page<D> getAllAppointments(Pageable pageable);

    public D getAppointmentById(Long id);

    public List<D> getAppointmentByStatus(EStatus status);

    public D updateAppointment(Long id,D d);

    public void deleteAppointment(Long id);

    public void deleteAllAppointment();
}
