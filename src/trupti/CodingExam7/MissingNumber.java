package trupti.CodingExam7;

public class MissingNumber {
	
	boolean isNumberMissing(int targetNumber, int[] input){
		
		boolean isNumMissing=true;
		for(int indexArr=0;indexArr<input.length;indexArr++) {
			if(targetNumber == input[indexArr]) {
				isNumMissing=false;				
			}
		}
		
		return isNumMissing;
	}
	
	int getSumOfMissingNum(int[] range, int[] input) {
		int sum=0;
		String missingNumbers = "";
		
		for(int indexRange=0;indexRange<range.length;indexRange++) {
			if(isNumberMissing(range[indexRange], input)==true) {
				if(missingNumbers.equals(""))
					missingNumbers = missingNumbers + " "+ String.valueOf(range[indexRange]);
				else
					missingNumbers = missingNumbers + " , "+ String.valueOf(range[indexRange]);
				
				sum=sum+range[indexRange];
			}
		}
		System.out.println("Missing numbers in given input Array : {"+missingNumbers+" }");
		return sum;
	}
	
	int getMaxOfMissingNum(int[] range, int[] input) {
		
		int max=0;
		
		for(int indexRange=0;indexRange<range.length;indexRange++) {
			if(isNumberMissing(range[indexRange], input)==true) {
				if(max < range[indexRange])
					max = range[indexRange];
			}
		}
		return max;
		
	}

	public static void main(String[] args) {
		MissingNumber missingnumber=new MissingNumber();
		int[] range ={1,2,3,4,5,6,7,8,9,10};
		int[] input = {1,3,4,7,9,10};
		
	    int outputSum=missingnumber.getSumOfMissingNum(range, input);
	    System.out.println("Sum of missing number is "+ outputSum);
	    int outputMax=missingnumber.getMaxOfMissingNum(range, input);
	    System.out.println("Max number in missing number "+outputMax);
	}

}
