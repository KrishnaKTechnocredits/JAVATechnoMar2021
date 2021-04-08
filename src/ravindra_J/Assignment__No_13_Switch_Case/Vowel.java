/*Assignment - 13 : 7th April'2021

WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel
*/
package ravindra_J.Assignment__No_13_Switch_Case;

class Vowel{
		
public static void main(String args[]){
	Vowel vowel = new Vowel();
	vowel.findVowel('b');
	vowel.findVowel('A');
	vowel.findVowel('i');
	vowel.findVowel('5');
	}
	
	void findVowel(char c){
		char ch = c;
		switch(ch){
		case 'a':
		case 'A':
			System.out.println("The given charcter "+ch+" is vowel");
		break;
		
		case 'e':
		case 'E':
			System.out.println("The given charcter "+ch+" is vowel");
		break;
		
		case 'i':
		case 'I':
			System.out.println("The given charcter "+ch+" is vowel");
		break;
		
		case 'o':
		case 'O':
			System.out.println("The given charcter "+ch+" is vowel");
		break;
		
		case 'u':
		case 'U':
			System.out.println("The given charcter "+ch+" is vowel");
		break;
		
		default:
			System.out.println("The given charcter "+ch+" is not vowel");
		break;
		
		}
	}
}



