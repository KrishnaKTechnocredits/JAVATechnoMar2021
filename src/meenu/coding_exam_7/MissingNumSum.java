package meenu.coding_exam_7;

/*1. return sum of all missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 21


2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
*/

public class MissingNumSum {
		
	int getSumOfMissingNum(int[] array){
		int numSum = 0;
		for(int num =1;num<=10;num++){			
			boolean isNumPresent = false;
			for(int index = 0;index<array.length;index++){
				if(num == array[index])
					isNumPresent = true;
			}	
			if(!isNumPresent)
				numSum = numSum+num;				
		}	
		return numSum;
	}
	
	int highestMissingNum(int[] array){
		int highestMissingNum = 1;
		for(int num =1;num<=10;num++){
				boolean isNumPresent = false;
				for(int index = 0;index<array.length;index++){
					if(num == array[index])
						isNumPresent = true;
				}
				if(!isNumPresent) {
					if(num > highestMissingNum)
						highestMissingNum = num;
			}	
		}		
			return highestMissingNum;
	}		
			
	public static void main(String[]args){
		MissingNumSum missingNumSum = new MissingNumSum();
		int[] arr = {1,3,4,7,9,10};
		System.out.println("Sum of missing number is : "+missingNumSum.getSumOfMissingNum(arr));
		System.out.println("Sum of missing number is : "+missingNumSum.highestMissingNum(arr));
	}
}	

	