package com.medicine.medicalstore.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicineController {
    @GetMapping("medicine")
    public String medicineExipryDate(){
        return "mrp";
    }
}
