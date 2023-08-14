package com.example.springsqlite.repositories;

import com.example.springsqlite.entity.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
