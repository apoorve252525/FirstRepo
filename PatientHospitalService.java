package service;

import domain.Hospital;
import domain.Patient;

public interface PatientHospitalService {

    Integer getTotalNumberOfPatients();

    Hospital addPatientToHospital(Patient patient);

}