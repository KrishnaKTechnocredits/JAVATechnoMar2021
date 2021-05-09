package prachi.Coding_Exam3;

/*WAP to return a string by removing all the vowels from the given String. Output should be printed in main method.

		 input :  globant india test automation engineer

		 output :  glbnt nd tst tmtn ngnr

		Branch name :
		Yourname_coding_exam_3*/


public class RemoveVovelsFromString {
	
	static String input="globant india test automation engineer";

		String str(String localStr) {
		String getNewString="";
		char ch;
		for(int index = 0 ; index < localStr.length() ; index++) {
			ch = localStr.charAt(index);
			if(!(ch=='a' ||ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I'|| ch=='O' || ch=='U'))
				getNewString+=ch;
		}
		return getNewString;
	}

	public static void main(String[] args) {
		RemoveVovelsFromString excludeVovel= new RemoveVovelsFromString();
		System.out.println("Input String is: " +"\n" +input);
		System.out.println("-----------------------------------------------------");
		String output = excludeVovel.str(input);
		System.out.println("Output String excluding vovels is: " +"\n" +output);
		System.out.println("-----------------------------------------------------");
	}
}

