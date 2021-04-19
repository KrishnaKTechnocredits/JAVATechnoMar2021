	/*Assignment 13
	 * WAP to evaluate whether given character is vowel or not using switch case.
sample input1 : d
sample output1 : d is not a vowel
  
sample input2 : I
sample output2 : I is a vowel

sample input3 : i
sample output3 : i is a vowel*/
	package pravin.Assignment_13;
	
	public class Switchcase {
		void m1(char ch) {
			ch = Character.toUpperCase(ch);
			switch (ch) {
			case 'A':
				System.out.println("A is vowel");
				break;
			case 'E':
				System.out.println("E is vowel");
				break;
			case 'I':
				System.out.println("I is vowel");
				break;
			case 'O':
				System.out.println("O is vowel");
				break;
			case 'U':
				System.out.println("U is vowel");
				break;
			default:
				System.out.println(ch + " is not vowel");
			}
		}
		public static void main(String[]args) {
			Switchcase switchcase = new Switchcase();
			switchcase.m1('9');
			switchcase.m1('a');
			switchcase.m1('E');
			switchcase.m1('*');
		}
	}
	