package technocredits.arrayDemo;

public class Example1 {

	void arrayFirstExample() {
		
		int[] arr = new int[5];
		arr[2] = 34;
		arr[4] = 44;
		
		System.out.println("Length of an array is " + arr.length);
		for(int index=0;index<arr.length;index++) {			
			System.out.println(arr[index]);
		}
	}
	
	public static void main(String[] args) {
		
		new Example1().arrayFirstExample();
		int[] stdRoll = {12,1,34,22,23};
		
		int[] stdRoll1 = new int[5];
		stdRoll1[0] = 12;
		stdRoll1[1] = 1;
		stdRoll1[2] = 34;
		
		//System.out.println(arr[5]);
	}
}
