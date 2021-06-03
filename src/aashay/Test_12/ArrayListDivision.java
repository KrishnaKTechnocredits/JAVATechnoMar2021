package aashay.Test_12;
/*
 * 
Programming Test - 12 : 22nd May'2021

1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15
 */

import java.util.ArrayList;

public class ArrayListDivision {

	ArrayList<Integer> arrayDivision(ArrayList<Integer> input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < input.size(); index++) {
			if ((input.get(index) % 3 == 0) || (input.get(index) % 5 == 0)) {
				output.add(input.get(index));
				//System.out.println(input.get(index));
			}
		}
		return output;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayListDivision arrayDivision = new ArrayListDivision();
		ArrayList<Integer> division = new ArrayList<Integer>();
		division.add(10);
		division.add(2);
		division.add(3);
		division.add(6);
		division.add(15);
		division.add(44);
		division.add(32);

		ArrayList<Integer> output = arrayDivision.arrayDivision(division);
		System.out.println(output);

	}

}
