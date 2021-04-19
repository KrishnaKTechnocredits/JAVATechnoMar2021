package mayur.codingexam1;

public class AgeDifference {
	void getDifference(int[] input) {
		int max = input[0];
		int min =input[0];
		for(int index =0;index<input.length;index++) {
			if(input[index]>max)
				max=input[index];
			if(input[index]<input.length)
				min=input[index];
				
		}
		System.out.println("Maximum age of a person is " +max);
		System.out.println("Minimum age of a person is " +min);
		if(max>min) {
			System.out.println("The age difference between two persons is " +(max-min));
		}
	}
	public static void main(String[] args) {
		AgeDifference age = new AgeDifference();
		int[] input = {7,12,56,62,25};
		age.getDifference(input);
	}
}
