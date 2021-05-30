package monika.Practise1.Revision2;

import monika.Practise1.Revision.Accessmodifer_Testing;

// input LISTEN , SILENT - YES
public class Anagram extends Accessmodifer_Testing {

	void isanagram(String string1, String string2) {

		boolean flag = false;
		for (int index = 0; index < string1.length(); index++) {
			char charString1 = string1.toLowerCase().charAt(index);
			for (int innerIndex = 0; innerIndex < string2.length(); innerIndex++) {
				char charString2 = string2.charAt(innerIndex);
				if (charString1 == charString2) {
					flag = true;
					break;
				}
			}
			if (flag == true) {
				if (index < string1.length()-1)
					flag = false;
				continue;
			} else
				break;
		}
		if (flag == true)
			System.out.println("Is Anagram");
		else
			System.out.println("Is not anagram");
	}

	public static void main(String[] args) {
		
		System.out.println(Accessmodifer_Testing.x);
		Accessmodifer_Testing obj = new Accessmodifer_Testing();
		System.out.println(obj.x);
		
		Anagram anagram = new Anagram();
		//anagram.isanagram("LISTEN", "silent");

	}

}