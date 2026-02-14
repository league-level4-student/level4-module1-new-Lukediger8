package _06_Hospital;

public class Surgeon extends Doctor{
	boolean performsSurgery;
	boolean makesHouseCalls = false;
	Patient patient = new Patient();
	public boolean performsSurgery() {
	return performsSurgery = true;
	
	}
	@Override
	public boolean doMedicine() {
		for(int i = 0; i < patients.size(); i++) {
			patient.checkPulse();
		}
		return doMedicine();
	}
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return makesHouseCalls;
	}

}
