package _06_Hospital;

import java.util.ArrayList;

public class Hospital {
	
    ArrayList<Patient> patients = new ArrayList<Patient>();
    ArrayList<Doctor> list = new ArrayList<Doctor>();
    Surgeon surgeon = new Surgeon();
    GeneralPractitioner gp = new GeneralPractitioner();
    

    public void addDoctor(Doctor d) {
    	list.add(d);
    	
    	
    }
    
    public void addPatient(Patient p) {
    	patients.add(p);
    }
    
    public ArrayList<Doctor> getDoctors() {
    	return list;
    }
    
    public ArrayList<Patient> getPatients() {
    	return patients;
    }
    public void assignPatientsToDoctors() {
    	
    }
}
