package com.example.service.adoption;

import org.springframework.data.annotation.Id;

import java.time.LocalDate;

record Dog(@Id Integer id, String name, String description, String owner,
           LocalDate dob) {
}
