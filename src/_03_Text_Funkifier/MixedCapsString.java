package _03_Text_Funkifier;

import java.util.Random;

public class MixedCapsString implements TextFunkifier{

    private String unfunkifiedText;

    public MixedCapsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

	@Override
	public String funkifyText() {
		String str = "";
		
		// TODO Auto-generated method stub
		for(int i = 0; i < unfunkifiedText.length();i++) {
			 if(i % 2 == 0) {
				str += unfunkifiedText.toLowerCase().charAt(i); 
			 }
			 else {
				 str += unfunkifiedText.toUpperCase().charAt(i); 
			 }
		}
		return str;
	}

}
