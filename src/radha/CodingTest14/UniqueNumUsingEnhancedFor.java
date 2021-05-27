package radha.CodingTest14;

import java.util.ArrayList;

public class UniqueNumUsingEnhancedFor {
	
	public ArrayList<Integer> getUniqueNumbers(int words[]) {
		ArrayList<Integer> outputUniq = new ArrayList<Integer>();
		for(int num : words) {
			if(!outputUniq.contains(num))
				outputUniq.add(num);
		}
		return outputUniq;
	}
	
	public static void main(String[] args) {
		UniqueNumUsingEnhancedFor uniq = new UniqueNumUsingEnhancedFor();
		int[] input = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> uniqOut = uniq.getUniqueNumbers(input);
		System.out.println("Output " + uniqOut);
	}

}
