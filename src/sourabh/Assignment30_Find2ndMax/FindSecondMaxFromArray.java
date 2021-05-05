/*
Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 
 */

package sourabh.Assignment30_Find2ndMax;

public class FindSecondMaxFromArray {
	void getSecondMaxFromArray(int[] arrInput) {
		int temp= 0;
		for(int index=0; index<arrInput.length; index++) {
			for(int index1=index+1; index1<arrInput.length; index1++) {
				if(arrInput[index]<arrInput[index1]) {
					temp= arrInput[index];
					arrInput[index]=arrInput[index1];
					arrInput[index1]=temp;
				}
			}
				
		}
		System.out.println(arrInput[1]);
	}
	public static void main(String[] args) {
		FindSecondMaxFromArray findSecondMaxFromArray= new FindSecondMaxFromArray();
		int[] arrInput= {10,33,43,55,97,11,3};
		findSecondMaxFromArray.getSecondMaxFromArray(arrInput);
	}

}
