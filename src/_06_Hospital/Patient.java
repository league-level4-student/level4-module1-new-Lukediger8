package _06_Hospital;

public class Patient {
private boolean feelsCaredFor;
int pulse;


	public Patient() {
	this.feelsCaredFor = false;
	pulse = 0;

}
	public boolean feelsCaredFor() {
		return this.feelsCaredFor;
	}
	public void checkPulse() {
		feelsCaredFor = true;
		}
}