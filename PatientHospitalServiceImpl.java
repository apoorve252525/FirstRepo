package service;

import domain.Hospital;
import domain.Patient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PatientHospitalServiceImpl implements PatientHospitalService {


    Map<String, Hospital> hospitals = new HashMap<String, Hospital>();
    public Integer getTotalNumberOfPatients() {
        return null;
    }

    public Hospital addPatientToHospital(Patient patient) {
        Hospital hospital = null;
        if (hospitals.containsKey(patient.getHospital())) {
            hospital = hospitals.get(patient.getHospital());
            hospital.getPatients().add(patient);
        } else {
            hospital = new Hospital();
            if (patient.getLocation().equalsIgnoreCase("BANGALORE")) {
                hospital.setLocation("BANGALORE");
            } else {
                hospital.setLocation("OUTSIDE BANGALORE");
            }
            hospital.setName(patient.getHospital());
            List<Patient> patients = new ArrayList<Patient>();
            patients.add(patient);
            hospital.setPatients(patients);
            hospitals.put(hospital.getName(), hospital);
        }
        return hospital;
    }
}
