package _06_Hospital;

public class GeneralPractitioner extends Doctor{
	boolean makesHouseCalls;
	Patient patient = new Patient();
	public void makesHouseCalls() {
		makesHouseCalls = true;
	}

	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		patient.feelsCaredFor();

	}
}
