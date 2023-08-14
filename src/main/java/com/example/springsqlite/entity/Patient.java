package com.example.springsqlite.entity;

import jakarta.persistence.*;
import lombok.*;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode()
@ToString

@Entity
@Table(name = "patients")
@SequenceGenerator(sequenceName = "patients_id_seq",
      name = "patients_id_seq", allocationSize = 1)
public class Patient {
      @Id
      @GeneratedValue(strategy = GenerationType. SEQUENCE, generator =
            "patients_id_seq")
      @Column(nullable = false)
      private Integer id;

      @Column(name = "first_name", nullable = false, unique = true)
      private String firstName;

      @Column(name = "last_name", nullable = false, unique = true)
      private String lastName;

      @Column(name = "icon")
      @ToString.Exclude
      private byte[] icon;

      public Patient(String firstName, String lastName, byte[] icon) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.icon = icon;
      }
}
