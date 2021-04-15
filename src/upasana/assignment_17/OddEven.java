/*
 Program 1: From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
 */


package upasana.assignment_17;

public class OddEven {
	
	void operation() {
		int countE=0;
		int[] arr= {10,23,26,27,88,87,65 };
		for(int index=0;index<arr.length;index++) {
			if(arr[index]%2==0){
				countE++;
			}
		}
		System.out.println("even - > "+countE);
		System.out.println("odd - > "+(arr.length-countE));
		
	}
	
	public static void main(String[] args) {
		OddEven oddEven = new OddEven();
		oddEven.operation();
	}
}
