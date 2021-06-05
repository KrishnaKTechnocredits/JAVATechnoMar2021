package shashank.coding_exam_21;

public class ReplaceWithTargetString2 {

	private String[] getreplaceWithTargetString(String input) {
		String inputArray[]=input.split(" ");
	    for (String word:inputArray) {
	    	if (word.contains("th"))
	    			word=word.replace("th", "ht");
	    	else if(word.contains("Th"))
	    		word=word.replace("Th", "hT");
	    }
		return inputArray;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReplaceWithTargetString2 replaceWithTargetString = new ReplaceWithTargetString2();
		String str1 = "This is the thread that given";
		String output[] = replaceWithTargetString.getreplaceWithTargetString(str1);
		System.out.println(output);
	}

}
