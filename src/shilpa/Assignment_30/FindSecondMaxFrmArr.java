/*Assignment - 30 : 4th May'2021
WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55
*/
package shilpa.Assignment_30;

public class FindSecondMaxFrmArr {
	void getSecondMaxFrmArr(int[] arr) {
		int tempVar;
		for(int index1=0;index1<arr.length;index1++) {
			for(int index2=index1+1;index2<arr.length;index2++) {
				if(arr[index1]>arr[index2]) {
					tempVar=arr[index1];
					arr[index1]=arr[index2];
					arr[index2]=tempVar;
										
				}
			}
		}
		System.out.println("Second Max Number is:-"+arr[arr.length-2]);
	}
	public static void main(String[] args) {
		FindSecondMaxFrmArr findSecondMaxFrmArr = new FindSecondMaxFrmArr();
		int[] inputArr = {10,33,43,55,97,11,3};
		findSecondMaxFrmArr.getSecondMaxFrmArr(inputArr);
	}

}
