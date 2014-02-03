import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MadLibsGame {
	public static void main(String[] args) throws IOException{
		String str1;
		String str2;
		String str3;
		MadLib myGame = new MadLib ();
		String templateStr = " ";
		
		System.out
				.println("Welcome to Mad Libs(R)! I am going to ask you for some lexical categories and when I am done, I'll give you the Mad Lib(R).");
		int templateNum = 1 + (int)(Math.random() * 3);
//		System.out.println(templateNum);
		if (templateNum == 1) {
			System.out.print("Enter an adjective: ");
			str1 = getString();
			System.out.print("Enter an adjective: ");
			str2 = getString();
			System.out.print("Enter a noun: ");
			str3 = getString();
			templateStr = myGame.template1(str1, str2, str3);
			
		} else if (templateNum == 2) {
			System.out.print("Enter a noun: ");
			str1 = getString();
			System.out.print("Enter a verb: ");
			str2 = getString();
			System.out.print("Enter an adjective: ");
			str3 = getString();
			templateStr =myGame.template2(str1, str2, str3);
			
		} else if (templateNum == 3) {
			System.out.print("Enter a verb: ");
			str1 = getString();
			System.out.print("Enter a preposition: ");
			str2 = getString();
			System.out.print("Enter a noun: ");
			str3 = getString();
			templateStr =myGame.template3(str1, str2, str3);
		} else {
			System.out.println("Error!");
		}
		
		System.out.println("Ok, here is your Mad Lib(R): ");
		System.out.println(templateStr);
	
	
	}
	
	public static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

}
