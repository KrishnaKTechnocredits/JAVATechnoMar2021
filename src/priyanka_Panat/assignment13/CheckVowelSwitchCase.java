/*Assignment - 13 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
*/

package priyanka_Panat.assignment13;

class CheckVowelSwitchCase{
	void findVowelusingSwitch( char ch){
		switch(ch){
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch + " is a Vowel");
                break;
			default:
				System.out.println(ch + " is a Consonant");
                break;
		}
	}

	public static void main(String[] args){
		CheckVowelSwitchCase checkvowelswitchcase= new CheckVowelSwitchCase();
		checkvowelswitchcase.findVowelusingSwitch('d');
		checkvowelswitchcase.findVowelusingSwitch('I');
		checkvowelswitchcase.findVowelusingSwitch('F');
		checkvowelswitchcase.findVowelusingSwitch('o');
		checkvowelswitchcase.findVowelusingSwitch('u');
	}
}
