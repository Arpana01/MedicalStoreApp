package com.medicine.medicalstore.controller;

import com.medicine.medicalstore.model.MedicineModel;
import com.medicine.medicalstore.repository.MedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MedicineController {

    @Autowired
    private MedicineRepository mr;

    @GetMapping("medicine")
    public String medicineExipryDate(){
        return "mrp";
    }


    @PostMapping("/addMedicine")
    public MedicineModel addMedicine(@RequestBody MedicineModel mc){
        return this.mr.save(mc);
    }






}



