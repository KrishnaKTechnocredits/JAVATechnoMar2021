package sandesh.Assignment_30;

public class ReturnOnlyVowels {

	String getOnlyVowels(String[] inputArray){
		String strSingle, strSentence = "";
		for(int index = 0; index < inputArray.length; index++) {
			strSingle = inputArray[index].toString();
			strSentence += strSingle + " ";
		}
		
		System.out.println(strSentence);
		String out = strSentence.replaceAll("[^aeiouAEIOU]", " ");
		return out;
	}
	
	public static void main(String[] args) {
		String[] str = {"Hello", "Hi", "How", "Are"};
		
		String outputString = new ReturnOnlyVowels().getOnlyVowels(str);
		System.out.println(outputString);
	}
}
