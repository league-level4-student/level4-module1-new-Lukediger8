package _06_Hospital;

public class Surgeon extends Doctor{
	boolean performsSurgery;
	boolean makesHouseCalls = false;
	Patient patient = new Patient();
	public boolean performsSurgery() {
	return performsSurgery = true;
	
	}
0
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return makesHouseCalls;
	}

}
