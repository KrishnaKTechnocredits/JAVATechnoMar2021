package sandesh.OWN_Practice_Sandesh_1;

import org.omg.CORBA.portable.ValueOutputStream;

public class StringMethodsManipulation {

	static String strNull;
	
	public static void main(String[] args) {
		String strTechno = "Techno";
		String strHello = "Hello";
		String strBlank = "";
		String strTechno1 = "Techno";
		String strTechnoCaps = "TECHNO";
		String strObject = new String("Credits");
		String strObject1 = new String("Credits");
		String strObject2 = new String("Hello");
		//strObject = strObject1;
		String strIntern = strObject2.intern();
		StringBuffer sbHello = new StringBuffer("Hello");
		
		
		
		long aadharNumber = 123456789;
		String aadharNumString = String.valueOf(aadharNumber); // to convert from any datatype to String use value of.
		
		String strSentence = "https://www.technocredits.com";
		String trimmedStrSentence = strSentence.trim();
		
		boolean result = false;
		
		
		System.out.println(strHello.contentEquals(sbHello));
		
		//System.out.println(aadharNumString.length());
				
		//System.out.println(strHello == strIntern); // Ans -: true. converts from SCP to object
		
		//System.out.println(strTechno.compareTo(strHello));
		
		//System.out.println(strTechno.toUpperCase() == strTechnoCaps); // Ans -: false. coz .toUpperCase() creates new object and comparing this object with SCP strTechnoCaps gives false.
		
		//System.out.println(strNull); // Ans -: null. This is non-initialized string
		
		//result = strTechno.equals(strHello); //Ans -: false. coz .equals() compares content.
		//System.out.println(result); // Ans -: false
		
		//System.out.println(strTechno.equals(strTechno1)); // Ans -: true. coz .equals() compares content.
		
		//System.out.println(strTechno == strTechno1); // Ans -: true. coz in the SCP both strTechno and strTechno1 are pointing to same string Techno
		
		//System.out.println(strObject == strObject1); // Ans-: false. coz memory address is different for strObject and strObject1.
		//System.out.println(strObject == strObject1); // Ans-: true. coz both strObject and strObject1 are poinitng to same object.
		
		//System.out.println(strObject.equals(strObject1)); // Ans -: true. coz .equals() compares content.
		
		//System.out.println(strBlank.isEmpty()); // Ans -: true.
		//System.out.println(strNull.isEmpty()); // Ans-: NullPointerException. Coz strNull is non-initialized and has value null.
		
		//System.out.println(strTechno.equalsIgnoreCase(strTechnoCaps)); // Ans -: true
		
		//System.out.println(strSentence.startsWith("https")); // Ans -: true. coz it startsWith given sequence of chars in argument.
		//System.out.println(strSentence.startsWith("")); // Ans -: true.
		//System.out.println(strSentence.startsWith("technocredits", strSentence.indexOf('.')+1)); // Ans-: true. here we are checking if a particular string 
																								 // startsWith specified sequence of characters given in argument 
																								 // after ignoring the first few characters which is specified by 2nd argument stating where to start looking from.
		
		//System.out.println(strSentence.endsWith(".com")); // true.
		//System.out.println(strSentence.endsWith("")); // true
		
		//System.out.println(strSentence.indexOf('.')); // Ans -: 11. first occurrence of char '.'; it returns -1 if char specified in argument is not present.
		
		//System.out.println(strSentence.lastIndexOf('.')); // Ans -: 25. Gives the last occurrence of specified argument.
		
		//System.out.println(strSentence.substring(strSentence.indexOf('w'))); // Ans -: gives substring starting from specified index in arguments till last.
		
		//System.out.println(strSentence.indexOf(""));
		//System.out.println(strSentence.lastIndexOf(""));
		//System.out.println(strSentence.lastIndexOf('m'));
		//System.out.println(strSentence.length());
		
		/* general algo to check if we are at the end of string.
		 * At the zeroth index we have "". Similarly at last index + 1 i.e. at string.length() 
		 * we have "". So in general, str.lastIndexOf("") == str.length(), we are at end of string.
		 * but first we need to normalize the string by trimming it.
		 */
		
		//System.out.println(strSentence.contains("https")); // Ans -: true. if specified substring is present it returns true.
		//System.out.println(strSentence.replace('.', '-')); // replaces all occurrences of '.' with '-'
		
		
		
		
		
	}
}
