package anubhav.StringOperations;

public class AllStringMethodsPractice {

	String str1 = "Anubhav123";
	String str4 = "Anubhav123";
	String str5 = "anubhav123";
	String str2 = "Aanubhav12";
	String str3 = "India is a very diversifed nation, it is part of united nations health organization";
	String str6 = "Techno Credits Maulik Harsh Krishna Anubhav Krati";

	void allConcatenate() {
		System.out.println("-- Concatenate-1: 2 input strings--");
		String output1 = str1.toString().concat(str2.toString());
		String output2 = str1.concat(str2);
		System.out.println(output1); // what is the difference between line 10 & line 11 above?
		System.out.println(output2);
		System.out.println("\n");

		System.out.println("-- Concatenate-2: using additional string --");
		System.out.println(str1.concat("baiswar")); // suffix using string method
		System.out.println(str2.concat("zzzzzzzz")); // suffix using string method
		System.out.println("zzzzzz".concat(str1)); // prefix using string method
		System.out.println("\n");

		System.out.println("-- Concatenate-3: default string concat using '+' --");
		System.out.println(str1 + str2);
		System.out.println("zzzzzzz" + str1); // prefix
		System.out.println(str1 + "zzzzzzz"); // suffix
		System.out.println("\n");
	}

	void findCharacterAndLength() {
		System.out.println("-- Find a character --");
		char ch = str1.charAt(5); // find character at a given index of string
		System.out.println(ch);
		System.out.println(str1.length()); // find length of string
		System.out.println("\n");
	}

	void changeCase() {
		System.out.println("-- Convert string to Upper & Lower Case --");
		System.out.println(str1.toLowerCase()); // all characters to lower case
		System.out.println(str2.toUpperCase()); // all characters to upper case
		System.out.println("\n");
	}

	void trimString() {
		System.out.println("-- Trim --");
		String temp = (" " + str1 + " ");
		System.out.println(temp.trim()); // Remove leading and trailing spaces
		System.out.println("\n");
	}

	void subStringFunctions() {
		System.out.println("-- Substring Functions --");
		System.out.println(str1.substring(4)); // removes first four index characters
		System.out.println(str1.substring(3, 6)); // removes characters from starting index and (end index-1) as
													// mentioned in method
		System.out.println("\n");
	}

	void replaceMethods() {
		System.out.println("-- Replace Functions --");
		String replace1Temp = str3.replace('a', 'X'); // replace any 1 character from complete string
		System.out.println(replace1Temp);
		String replace2Temp = str3.replace("na", "YY"); // replace sequence of characters from the string
		System.out.println(replace2Temp);
		String replace3Temp = str3.replaceAll("na", "YY"); // difference between replace() and replaceAll()
		System.out.println(replace3Temp);
		String replace4Temp = str3.replaceFirst("na", "ZZ"); // replaces only first occurrence in the string
		System.out.println(replace4Temp);
		System.out.println("\n");
	}

	void characterArray() {
		System.out.println("-- Character array of input string --");
		char[] replace5Temp = (str1.toCharArray()); // converts input string to a character array of length= string.length()
		System.out.println(replace5Temp);
		System.out.println(replace5Temp[0] + " " + replace5Temp[3]);
		System.out.println("\n");

	}

	void compareToMthodAndCompareToIgnorMethod() {
		System.out.println("-- Compare strings on lexicographical difference --");
		int compare1Temp = str1.compareToIgnoreCase(str4); // ignore case and compare strings
		System.out.println(compare1Temp);
		int compare2Temp = str1.compareToIgnoreCase(str5); // ignore case and compare strings
		System.out.println(compare2Temp);
		int compare3Temp = str5.compareToIgnoreCase(str1); // ignore case and compare strings
		System.out.println(compare3Temp);
		int compare4Temp = str4.compareToIgnoreCase(str5); // ignore case and compare strings
		System.out.println(compare4Temp);
		int compare9Temp = str4.compareToIgnoreCase(str2); // ignore case and compare strings
		System.out.println(compare9Temp);

		System.out.println("-- Compare strings on lexicographical difference --");
		int compare5Temp = str1.compareTo(str4); // compare strings without case ignore
		System.out.println(compare5Temp);
		int compare6Temp = str1.compareTo(str5); // compare strings without case ignore
		System.out.println(compare6Temp);
		int compare7Temp = str5.compareTo(str1); // compare strings without case ignore
		System.out.println(compare7Temp);
		int compare8Temp = str4.compareTo(str5); // compare strings without case ignore
		System.out.println(compare8Temp);
		System.out.println("\n");
	}

	void containsMethod() { //returns if the input string contains given char/string
		System.out.println("-- Contains method --");
		boolean contains1Temp= str1.contains("na");
		System.out.println(contains1Temp);
		boolean contains2Temp= str3.contains("na");
		System.out.println(contains2Temp); 
		System.out.println("\n");
	}
	
	void splitMethods() {
		System.out.println("-- Split string methods --");
		String [] split1Temp= str6.split(" "); // Split the string from " " in the string and store in an array
		System.out.println(split1Temp[1] + " " + split1Temp[0] + " " + split1Temp[3] + " " + split1Temp[6]);
		System.out.println("\n");
	}

	public static void main(String[] args) {
		AllStringMethodsPractice allStringMethodsPractice = new AllStringMethodsPractice();
		allStringMethodsPractice.allConcatenate();
		allStringMethodsPractice.findCharacterAndLength();
		allStringMethodsPractice.changeCase();
		allStringMethodsPractice.trimString();
		allStringMethodsPractice.subStringFunctions();
		allStringMethodsPractice.replaceMethods();
		allStringMethodsPractice.characterArray();
		allStringMethodsPractice.compareToMthodAndCompareToIgnorMethod();
		allStringMethodsPractice.containsMethod();
		allStringMethodsPractice.splitMethods();
	}
}
