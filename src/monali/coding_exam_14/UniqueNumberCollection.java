package monali.coding_exam_14;

import java.util.ArrayList;

public class UniqueNumberCollection {
	
	public ArrayList<Integer> getUniqueNumbers(ArrayList<Integer> word) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < word.size(); index++) {
			if(!output.contains(word.get(index))) 
				 output.add(word.get(index));

}
		return output;
	}
	
	public static void main(String[] args) {
		 UniqueNumberCollection unique = new  UniqueNumberCollection();
			ArrayList<Integer> number = new ArrayList<Integer>();
			number.add(1);
			number.add(8);
			number.add(6);
			number.add(3);
			number.add(4);
			number.add(5);
			number.add(2);
			number.add(3);
			number.add(6);
			number.add(9);
			number.add(8);
			number.add(4);
			ArrayList<Integer> output = unique.getUniqueNumbers(number);
			System.out.println("Unique numbers are " +output);

	}
}
