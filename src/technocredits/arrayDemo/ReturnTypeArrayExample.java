package technocredits.arrayDemo;

public class ReturnTypeArrayExample {

	int outputIndex = 0;
	int[] getAllPositiveNumbers(int[] num) {
		int[] output = new int[num.length];
		for(int index=0;index<output.length;index++) {
			if(num[index] > 0) {
				output[outputIndex] = num[index];
				outputIndex++;
				if(outputIndex == 2)
					break;
			}
		}
		return output;
	}
	
	String[] getNames(String[] name) {
		String[] output = new String[name.length];
		int outputIndex = 0;
		for(int index=0;index<name.length;index++) {
			if(name[index].length() > 5) {
				output[outputIndex] = name[index];
				outputIndex++;		
			}
		}
		return output; 
	}
	
	public static void main(String[] args) {
		int[] givenNums = new int[] {10,-2,-4,23,11};
		ReturnTypeArrayExample returnTypeArrayExample = new ReturnTypeArrayExample();
		int[] answer = returnTypeArrayExample.getAllPositiveNumbers(givenNums);
		
		for(int index=0;index<returnTypeArrayExample.outputIndex;index++) {
			if(answer[index] != 0)
				System.out.println(answer[index]);
		}
		System.out.println("End");
	}
}
