package _03_Text_Funkifier;

public class BackwardsString implements TextFunkifier {

    private String unfunkifiedText;

    public BackwardsString(String unfunkifiedText) {

        this.unfunkifiedText = unfunkifiedText;

    }

    @Override
    public String funkifyText() {
    	String str = "";
    	for(int i = unfunkifiedText.length()-1; i>-1; i--) {
    		str+=unfunkifiedText.charAt(i);
    	}
        return str;

    }
}
