package kajal.StringAndCharProgram;

public class Assignment21p1 {

	void countCharType(String input) {
		int uppercase = 0,lowercase = 0,digit = 0,letter =0,special =0;
		
		for(int index=0;index<input.length();index++) {
			int ascciValue = input.charAt(index);
			
			if(ascciValue>=65 && ascciValue<=90) {
				uppercase++;
				letter++;
			}
			else if (ascciValue >= 97 && ascciValue <= 122) {
				lowercase++;
				letter++;

			}
			else if (ascciValue >= 48 && ascciValue <= 57) {
				digit++;
			}
			else
				special++;

		}
			System.out.println("Total digit: "+digit+"\nTotal letters: "+letter+"\ntotal uppercase: "+uppercase+
				"\nTotal lowercase: "+lowercase+"\nTotal special character: "+special);

	}

	public static void main(String[] args) {
		String input ="1rRpd3F9#K(E";
		new Assignment21p1().countCharType(input);
	}

}

