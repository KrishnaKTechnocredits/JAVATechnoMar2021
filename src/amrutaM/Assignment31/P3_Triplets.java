package amrutaM.Assignment31;

/*Program 3: 
int[] arr = {10,23,24,25,26,61,62,64,65,66};
output : 3
Note : 23,24,25
       24,25,26
	   64,65,66*/
public class P3_Triplets {

	void getTripletsCount(int[] input) {
		int index = 0;
		int count = 0;
		while (index < input.length - 2) {
			int num1 = input[index];
			// System.out.println("num1 --> "+num1);
			if ((input[index + 1] == num1 + 1) && (input[index + 2] == num1 + 2)) {
				count++;
			}
			index++;
			
		}
		System.out.println("Total number of triplets are --> " + count);
	}

	public static void main(String[] args) {
		int[] arr = { 10, 23, 24, 25, 26, 61, 62, 64, 65, 66 };
		P3_Triplets p3_Triplets = new P3_Triplets();
		p3_Triplets.getTripletsCount(arr);
	}
}
