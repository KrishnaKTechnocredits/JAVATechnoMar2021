/*
Program 4:  write a program which will print characters between ascii value 97 to 122.
 */
package radha.CharacterMethods.Assignment18;

public class PrintCharValue {
	
	char getChar(int asciiValue) {
		return (char)asciiValue;
	}
	
	public static void main(String[] args) {
		PrintCharValue printCharacter = new PrintCharValue();
		for (int i = 97; i <= 122; i++) {
			char retValue = printCharacter.getChar(i);
			System.out.println("The Character of ASCII value "+i+" is "+retValue);
		}
	}
}

/*
Output:

The Character of ASCII value 97 is a
The Character of ASCII value 98 is b
The Character of ASCII value 99 is c
The Character of ASCII value 100 is d
The Character of ASCII value 101 is e
The Character of ASCII value 102 is f
The Character of ASCII value 103 is g
The Character of ASCII value 104 is h
The Character of ASCII value 105 is i
The Character of ASCII value 106 is j
The Character of ASCII value 107 is k
The Character of ASCII value 108 is l
The Character of ASCII value 109 is m
The Character of ASCII value 110 is n
The Character of ASCII value 111 is o
The Character of ASCII value 112 is p
The Character of ASCII value 113 is q
The Character of ASCII value 114 is r
The Character of ASCII value 115 is s
The Character of ASCII value 116 is t
The Character of ASCII value 117 is u
The Character of ASCII value 118 is v
The Character of ASCII value 119 is w
The Character of ASCII value 120 is x
The Character of ASCII value 121 is y
The Character of ASCII value 122 is z
*/