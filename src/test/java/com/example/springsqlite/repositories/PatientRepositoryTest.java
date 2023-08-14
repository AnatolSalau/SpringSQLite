package com.example.springsqlite.repositories;

import com.example.springsqlite.entity.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PatientRepositoryTest {

      @Autowired
      private PatientRepository patientRepository;

      @Test
      void savePatient() {
            Patient save = patientRepository.save(new Patient(
                  "firstName1", "secondName", new byte[0xe0]
            ));
      }

      @Test
      void savePatientException() {
            try {
                  Patient save = patientRepository.save(new Patient(
                        "firstName1", "secondName", new byte[0xe0]
                  ));
            } catch (Exception e) {
                  System.out.println("____________________________________________________\n");
                  System.out.println("____________________________________________________\n");
            }
      }
}