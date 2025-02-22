package com.furkanyildirim.business.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

//D: Dto
//E: Entity
public interface IPatientService<D,E> {
    public D entityToDto(E e);
    public E dtoToEntity(D d);

    public D createPatient(D d);

    public Page<D> getAllPatients(Pageable pageable);

    public D getPatientById(Long id);

    public D updatePatient(Long id, D d);

    public void deletePatient(Long id);

    public void deleteAllPatients();
}
