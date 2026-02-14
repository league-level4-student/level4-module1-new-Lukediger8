package _06_Hospital;

public class GeneralPractitioner extends Doctor{
	boolean makesHouseCalls;
	boolean performsSurgery = false;
	Patient patient = new Patient();
	public boolean makesHouseCalls() {
		return makesHouseCalls = true;
	}

	@Override
	public boolean doMedicine() {
		for(int i = 0; i < patients.size(); i++) {
			patient.checkPulse();
		}
		return doMedicine();
	}
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		return performsSurgery;
	}
}
