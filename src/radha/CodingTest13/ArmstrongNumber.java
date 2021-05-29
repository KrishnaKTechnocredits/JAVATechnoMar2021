/*
1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int numbser[]){
	//write your logic
}

 */
package radha.CodingTest13;

import java.util.ArrayList;

import javax.print.attribute.standard.OrientationRequested;

public class ArmstrongNumber {
	
	public ArrayList<Integer> getArmStrongNumber(int number[]){
		ArrayList<Integer> output = new ArrayList<Integer>();
		for(int index=0;index<number.length;index++) {
			int armstrong=0, rem=0, num=0;
			num = number[index];
			while(num!=0) {
				rem = num%10;
				num = num/10;
				armstrong = armstrong+(rem*rem*rem);
			}
			if(armstrong==number[index]) {
				output.add(number[index]);
			}
		}
		return output;
	}
	
	public static void main(String[] args) {
		ArmstrongNumber armstrong = new ArmstrongNumber();
		int[] givenArray = {153,279,371,303,407};
		ArrayList<Integer> output = armstrong.getArmStrongNumber(givenArray);
		System.out.println("Armstrong Numbers are "+output);
	}
}