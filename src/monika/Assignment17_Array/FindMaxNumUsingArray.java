package monika.Assignment17_Array;
/*Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/
public class FindMaxNumUsingArray {
	
	void getFreq() {
		int temp = 0;
		int arr[] = {22,35,65,88,11,23,45};
		for(int index=0;index<arr.length;index++) {
			if(arr[0]>arr[index+1])//0 false
				temp = arr[0];
			else if(arr[1]>arr[index+2])//0 true -88 temp //1 
				temp = arr[1];
			else if(arr[2]>arr[index+3])
				temp = arr[2];
			else if(arr[3]>arr[index+4])
				temp = arr[3];
			else if(arr[4]>arr[index+5])
				temp = arr[4];
			else if(arr[5]>arr[index+6])
				temp = arr[5];
			else if(arr[6]>arr[index+7])
				temp = arr[6];
			
			
		
		}
	}
	
	public static void main(String[] args) {

	}

}
