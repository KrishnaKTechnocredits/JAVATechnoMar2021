package siddhant;

import java.util.Scanner;

public class CountCharFromString {

	public void displayCountOfCharFromString(String input , char charToVerify) {
		if(!input.isEmpty()) {
			int sLengh=input.length()-1;
			int cnt , iCounter;
			iCounter=0;
			for(cnt=0; cnt<=sLengh ;cnt++) {
				if(input.charAt(cnt)== charToVerify) {
					iCounter++;
				}
			}

			if(iCounter > 0) {
				System.out.println("The given character ["+charToVerify+"]"+ " found in Input ["+input+"] for ["+iCounter+"] times ");
			}else {
				System.out.println("Character "+charToVerify+ " not found in input ["+input+"]");
			}
		}
	}

	public static void main(String[] args) {
		try {
			Scanner scanner=new Scanner(System.in);
			String input=scanner.next();
			new CountCharFromString().displayCountOfCharFromString(input,'e');
			scanner.close();
		}catch(Exception e) {
			e.getMessage();
			e.printStackTrace();
		}

	}
}