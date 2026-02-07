package _06_Hospital;

public class Surgeon extends Doctor{
	boolean performsSurgery;
	Patient patient = new Patient();
	public void performsSurgery() {
	performsSurgery = true;
	}
	@Override
	public void doMedicine() {
		// TODO Auto-generated method stub
		patient.feelsCaredFor();
	}

}
