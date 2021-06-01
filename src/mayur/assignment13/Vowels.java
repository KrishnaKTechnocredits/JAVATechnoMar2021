package mayur.assignment13;

public class Vowels {
	
	void Vowel(String ch) {
		switch(ch) {
		case "A":
		case "a":
			System.out.println(ch + " is a Vowel");
			break;
		case "E":
		case "e":
			System.out.println(ch + "is a Vowel");
			break;
		case "I":
		case "i":
			System.out.println(ch + "is a Vowel");
			break;
		case "O":
		case "o":
			System.out.println(ch + "is a Vowel");
			break;
		case "U":
		case "u":
			System.out.println(ch + "  is a Vowel");
			break;
		default :
			System.out.println(ch + " is not a Vowel");
		}
	}

	public static void main(String[] args) {
		Vowels v = new Vowels();
		v.Vowel("d");
		v.Vowel("A");

	}

}

