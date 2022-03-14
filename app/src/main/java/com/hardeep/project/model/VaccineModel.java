package com.hardeep.project.model;

public class VaccineModel {

    private String vaccineCenter;
    private String vaccinationCharges;
    private String vaccinationAge;
    private String vaccinationTimings;
    private String vaccineName;
    private String vaccineCenterTime;
    private String vaccinationCenterAddress;
    private String vaccineAvailable;

    public VaccineModel() {

    }

    public String getVaccineCenter() {
        return vaccineCenter;
    }

    public void setVaccineCenter(String vaccineCenter) {
        this.vaccineCenter = vaccineCenter;
    }

    public String getVaccintionCharges() {
        return vaccinationCharges;
    }

    public void setVaccintionCharges(String vaccintionCharges) {
        this.vaccinationCharges = vaccintionCharges;
    }

    public String getVaccinationAge() {
        return vaccinationAge;
    }

    public void setVaccinationAge(String vaccinationAge) {
        this.vaccinationAge = vaccinationAge;
    }

    public String getVacccintionTimings() {
        return vaccinationTimings;
    }

    public void setVacccintionTimings(String vacccintionTimings) {
        this.vaccinationTimings = vacccintionTimings;
    }

    public String getVaccineName() {
        return vaccineName;
    }

    public void setVaccineName(String vaccineName) {
        this.vaccineName = vaccineName;
    }

    public String getVaccineCenterTime() {
        return vaccineCenterTime;
    }

    public void setVaccineCenterTime(String vaccineCenterTime) {
        this.vaccineCenterTime = vaccineCenterTime;
    }

    public String getVaccinationCenterAddress() {
        return vaccinationCenterAddress;
    }

    public void setVaccinationCenterAddress(String vaccinationCenterAddress) {
        this.vaccinationCenterAddress = vaccinationCenterAddress;
    }

    public String getVaccineAvailable() {
        return vaccineAvailable;
    }

    public void setVaccineAvailable(String vaccineAvailable) {
        this.vaccineAvailable = vaccineAvailable;
    }

    public VaccineModel(String vaccineCenter, String vaccintionCharges, String vaccinationAge, String vacccintionTimings, String vaccineName, String vaccineCenterTime, String vaccinationCenterAddress, String vaccineAvailable) {
        this.vaccineCenter = vaccineCenter;
        this.vaccinationCharges = vaccintionCharges;
        this.vaccinationAge = vaccinationAge;
        this.vaccinationTimings = vacccintionTimings;
        this.vaccineName = vaccineName;
        this.vaccineCenterTime = vaccineCenterTime;
        this.vaccinationCenterAddress = vaccinationCenterAddress;
        this.vaccineAvailable = vaccineAvailable;
    }
}
