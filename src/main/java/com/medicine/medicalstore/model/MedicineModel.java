package com.medicine.medicalstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class MedicineModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String productName;
    private String batchNo;
    private LocalDateTime mfgDate;
    private LocalDateTime expirydate;
    private long mrp;

    public MedicineModel(int id, String productName, String batchNo, LocalDateTime mfgDate, LocalDateTime expirydate, long mrp) {
        this.id = id;
        this.productName = productName;
        this.batchNo = batchNo;
        this.mfgDate = mfgDate;
        this.expirydate = expirydate;
        this.mrp = mrp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBatchNo() {
        return batchNo;
    }

    public void setBatchNo(String batchNo) {
        this.batchNo = batchNo;
    }

    public LocalDateTime getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(LocalDateTime mfgDate) {
        this.mfgDate = mfgDate;
    }

    public LocalDateTime getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(LocalDateTime expirydate) {
        this.expirydate = expirydate;
    }

    public long getMrp() {
        return mrp;
    }

    public void setMrp(long mrp) {
        this.mrp = mrp;
    }
}
