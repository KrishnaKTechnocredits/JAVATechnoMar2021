package madhavi_Khasbage.Coding_Exam_14;

import java.util.ArrayList;

/*2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
	 * 8:30
}
*/

public class FindUniqueNumber {
	
	public ArrayList<Integer> getUniqueNumbers(int words[]){
		ArrayList<Integer> arrList= new ArrayList<Integer>();
		boolean isDuplicate=false;
		for (int index = 0; index < words.length; index++) {			
			for (int indexIn = 0; indexIn < index; indexIn++) {				
				if(words[index]==words[indexIn]) {
					isDuplicate=true;	
					break;
				}				
			}				
			if(isDuplicate==false) {
				arrList.add(words[index]);
			}
			
			isDuplicate=false;
		}
		
		return arrList;
	}
	
	public static void main(String[] args) {
		FindUniqueNumber findUnique=new FindUniqueNumber();
		int[] arr= {1,8,6,3,4,5,2,3,6,9,8,4};
		ArrayList<Integer> arrList = findUnique.getUniqueNumbers(arr);
		
		System.out.println("These are the unique numbers from given array :"+ arrList );
		
	}

}
