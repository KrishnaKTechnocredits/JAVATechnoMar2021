package monika.Assignment17_Array;
/*Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount*/
public class CountOddEvenNumUsingArray {

	void getCountOfOddEvenNum() {
		int[] arr = {10,23,26,27,88,87,65};
		int evenCount = 0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index] % 2 == 0)
				evenCount++;
		}
		int oddCount = arr.length-evenCount;
		System.out.println("Even Count : "+evenCount+"\n Odd count : "+oddCount);
	}
	
	
	public static void main(String[] args) {
		CountOddEvenNumUsingArray oddevenNumArr = new CountOddEvenNumUsingArray();
		oddevenNumArr.getCountOfOddEvenNum();
	}

}
