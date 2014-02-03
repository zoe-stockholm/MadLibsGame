
public class MadLib {
	private String[] templateArray;

	// constructor
	public MadLib () {
		templateArray = new String [10];	
	}
	
	public String template1 (String AdjP, String AdjP2, String NP) {
		templateArray[0] = "The";
		templateArray[1] = AdjP;
		templateArray[2] = "alien";
		templateArray[3] = "eyed";
		templateArray[4] = "the";
		templateArray[5] = AdjP2;
		templateArray[6] = NP;
		templateArray[7] = "hungrily";
		templateArray[8] = ".";
		
		String t = " ";
		for (int i = 0; i < 9; i++) {
			t = t + templateArray[i] + " ";
		}
		
		return t;
	}
	
	public String template2 (String NP, String VP, String AdjP) {
		templateArray[0] = "If";
		templateArray[1] = "you";
		templateArray[2] = "use";
		templateArray[3] = NP;
		templateArray[4] = "to";
		templateArray[5] = VP;
		templateArray[6] = ",";
		templateArray[7] = "I'm";
		templateArray[8] = AdjP;
		templateArray[9] = ".";
		
		String t = " ";
		for (int i = 0; i < 10; i++) {
			t = t + templateArray[i] + " ";
		}
		
		return t;
	}
	
	public String template3 (String VP, String PP, String NP) {
		templateArray[0] = "People";
		templateArray[1] = "like";
		templateArray[2] = "to";
		templateArray[3] = VP;
		templateArray[4] = PP;
		templateArray[5] = "the";
		templateArray[6] = NP;
		templateArray[7] = ".";
		
		String t = " ";
		for (int i = 0; i < 8; i++) {
			t = t + templateArray[i] + " ";
		}
		
		return t;
	}
	
}
