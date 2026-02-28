package _06_Hospital;

import java.util.ArrayList;


public abstract class Doctor {    
	ArrayList<Patient> patients;
	public Doctor(){

	this.patients = new ArrayList<Patient>();
	}
	public void assignPatient(Patient patient) throws DoctorFullException{
		if(patients.size()> 2) {
			throw new DoctorFullException();
		}
		else{
			patients.add(patient);
		}
	}
    public ArrayList<Patient> getPatients() {
        return patients;
    }

	public void doMedicine() {
		for(int i = 0; i < patients.size(); i++) {
			patients.get(i).checkPulse();
		}
	}	
}