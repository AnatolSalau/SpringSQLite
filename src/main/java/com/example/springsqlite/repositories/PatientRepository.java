package com.example.springsqlite.repositories;

import com.example.springsqlite.entity.Patient;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Transactional
public interface PatientRepository extends JpaRepository<Patient, Integer> {
      @Override
      void delete(Patient entity);

      @Override
      Optional<Patient> findById(Integer integer);

      @Override
      void deleteById(Integer integer);
}
