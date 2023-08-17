package com.example.springsqlite.repositories;

import com.example.springsqlite.entity.Patient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

@SpringBootTest
class PatientRepositoryTest {

      @Autowired
      private PatientRepository patientRepository;

      private Patient patient1 = new Patient(
            "firstName1", "secondName", new byte[0xe0]);

      @Test
      void savePatient() {
            Patient save = patientRepository.save(patient1);
      }

      @Test
      void savePatientException() {
            try {
                  Patient save = patientRepository.save(patient1);
            } catch (Exception e) {
                  System.out.println("____________________________________________________\n");
                  System.out.println("savePatientException\n");
                  System.out.println("____________________________________________________\n");
            }
      }

      @Test
      void deletePatient() {
            Patient byId = patientRepository.findById(1).get();
            patientRepository.delete(byId);
      }

      @Test
      void deletePatientById() {
            patientRepository.deleteById(1);
      }

      @Test
      void findPatientById() {
            Patient byId = patientRepository.findById(1).get();
            System.out.println(byId);
      }
}