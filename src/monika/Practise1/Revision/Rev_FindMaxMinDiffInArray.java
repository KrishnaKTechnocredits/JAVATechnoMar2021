package monika.Practise1.Revision;

/*WAP to provide the difference between a Younger and 
 * an elder member of the family. 
Age is provided in the form of an array.
Sample Input: 7 12 56 62 25
Sample Output: 55*/
public class Rev_FindMaxMinDiffInArray {
	public int m1(int[] arr) {
		int tempMax = 0; 
		int tempMin = arr[0] ;
		for(int index = 0;index<arr.length;index++) {
			if(arr[index] > tempMax) {
				tempMax = arr[index];
			}	
		}System.out.println(tempMax);
		for(int indexMin = 1;indexMin<arr.length;indexMin++) {
			if(arr[indexMin] < tempMin)
				tempMin = arr[indexMin];
	}System.out.println(tempMin);
	
	return tempMax - tempMin;
	}

	public static void main(String[] args) {
		Rev_FindMaxMinDiffInArray obj = new Rev_FindMaxMinDiffInArray();
		int[] arr = { 7, 12, 56, 62, 25 };
		int i = obj.m1(arr);
		System.out.println(i);
	}

}
