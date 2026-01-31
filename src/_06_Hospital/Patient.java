package _06_Hospital;

public class Patient {
boolean feelsCaredFor = false;
Doctor doc = new Doctor();

public void feelsCaredFor() {
	if(doc.checkPulse() == true) {
		feelsCaredFor = true;
	}
	else {
		feelsCaredFor = false;
	}
}
}