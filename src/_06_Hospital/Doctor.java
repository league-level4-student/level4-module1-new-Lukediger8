package _06_Hospital;

import java.util.ArrayList;


public abstract class Doctor {    
	ArrayList<Patient> patients;
	public Doctor(){
	this.patients = new ArrayList<Patient>();
	}
	public void assignPatient(Patient patient) throws Exception{
		if(patients.size()> 3) {
			throw new DoctorFullException();
		}
		patients.add(patient);
	}
    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public abstract void doMedicine();
}
    

