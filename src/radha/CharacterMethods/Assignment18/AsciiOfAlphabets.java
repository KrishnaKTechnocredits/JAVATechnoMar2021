/*
 Program 3:  write a method which will print ascii value of A to Z.
 */

package radha.CharacterMethods.Assignment18;

public class AsciiOfAlphabets {
	
	int getAsciiAToZ(char ch) {
		return ch;
	}
	
	public static void main(String[] args) {
		AsciiOfAlphabets asciiATOZ = new AsciiOfAlphabets();
		System.out.println("*****ASCII value of characters from A to Z*****");
		for(char charA='A'; charA<= 'Z';charA++) {
			int value = asciiATOZ.getAsciiAToZ(charA);
			System.out.println(charA+" : "+value);
		}
	}
}
/*
Output:
*****ASCII value of characters from A to Z*****
A : 65
B : 66
C : 67
D : 68
E : 69
F : 70
G : 71
H : 72
I : 73
J : 74
K : 75
L : 76
M : 77
N : 78
O : 79
P : 80
Q : 81
R : 82
S : 83
T : 84
U : 85
V : 86
W : 87
X : 88
Y : 89
Z : 90
*/