package _06_Hospital;

public class Patient {
boolean feelsCaredFor;
int pulse;


	public Patient() {
	this.feelsCaredFor = false;
	pulse = 0;

}
	public void feelsCaredFor() {
		this.feelsCaredFor = true;
	}
	public void checkPulse() {
		feelsCaredFor = true;
		}
}