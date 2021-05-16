/*
2. return highest missing number from given array.
Range : 1 to 10
input : {1,3,4,7,9,10};
output : 8
*/
package sourabh.CodingExam_7;

public class HighestMissingNumberFromArray {
	int getHighestMissingNumberFromArray(int[] arrInput) {
		int maxNum=1;
		for(int num=1; num<=10; num++) {
			boolean isNumPresent= false;
			for(int index=0; index<arrInput.length; index++) {
				if(num==arrInput[index]) {
					isNumPresent=true;
					break;
				}
			}
			if(isNumPresent==false) {
				if(maxNum<num)
					maxNum=num;
			}
		}
		return maxNum;
		
	}
	public static void main(String[] args) {
		HighestMissingNumberFromArray highestMissingNumberFromArray=new HighestMissingNumberFromArray();
		int[] arrInput= {1,3,4,7,9,10};
		int strOutput= highestMissingNumberFromArray.getHighestMissingNumberFromArray(arrInput);
		System.out.println("output : "+strOutput);
	}

}
