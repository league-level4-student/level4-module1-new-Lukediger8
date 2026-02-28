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
    	int j = 0;
    	for(int i = 0; i < list.size(); i++) {
			while(j < patients.size()) {
				try { 
					list.get(i).assignPatient(patients.get(j));
					j+=1;
				
				} catch(DoctorFullException e) {
					break;
				}
			}
    }
}
}
