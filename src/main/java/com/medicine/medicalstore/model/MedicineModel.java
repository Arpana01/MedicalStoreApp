package com.medicine.medicalstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class MedicineModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String productName;
    private String batchNo;
    private Date mfgDate;
    private Date expirydate;
    private long mrp;

    public MedicineModel(int id, String productName, String batchNo, Date mfgDate, Date expirydate, long mrp) {
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

    public Date getMfgDate() {
        return mfgDate;
    }

    public void setMfgDate(Date mfgDate) {
        this.mfgDate = mfgDate;
    }

    public Date getExpirydate() {
        return expirydate;
    }

    public void setExpirydate(Date expirydate) {
        this.expirydate = expirydate;
    }

    public long getMrp() {
        return mrp;
    }

    public void setMrp(long mrp) {
        this.mrp = mrp;
    }
}
