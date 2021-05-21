package prachi.Assignment_30;

/*Assignment - 30 : 4th May'2021

WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 */

public class FindSecondMaxNumber {

	static int inputArr[]={10,33,43,55,97,11,3};

	static int getSecondMaxNum(int[] arr){  
		int temp;  
		for (int i=0; i <= arr.length; i++)   
		{  
			for (int j = i; j < arr.length; j++)   
			{  
				if (arr[i] > arr[j])   
				{  
					temp = arr[i];  
					arr[i] = arr[j];  
					arr[j] = temp;  
				}  
			}  
		}  
		return arr[arr.length-2];  
	} 
	
	public static void main(String args[]){  
		System.out.println("Second Max Number is: "+getSecondMaxNum(inputArr));  
	}
}  