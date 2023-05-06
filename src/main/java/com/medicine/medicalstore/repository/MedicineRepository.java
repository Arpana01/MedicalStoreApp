package com.medicine.medicalstore.repository;

import com.medicine.medicalstore.model.MedicineModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicineRepository extends JpaRepository<MedicineModel, Integer> {


}
