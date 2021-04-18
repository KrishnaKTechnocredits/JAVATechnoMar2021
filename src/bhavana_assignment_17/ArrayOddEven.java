package bhavana_assignment_17;



/*Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount*/

public class ArrayOddEven {

	int evenCount=0,oddCount=0;
	void oddEven() {
		int[] arr= {10,23,26,27,88,87,65};
		
		
		for(int index=0;index<arr.length;index++) {
			if(arr[index]%2==0) {
				evenCount++;
			}else
				oddCount++;
		}	
	}
	
	void display() {
		System.out.println("Count of even numbers:"+evenCount);
		System.out.println("Count of odd numbers:"+oddCount);
	}
	public static void main(String[] args) {
		ArrayOddEven arrayOddEven=new ArrayOddEven();
		arrayOddEven.oddEven();
		arrayOddEven.display();
	}
}
