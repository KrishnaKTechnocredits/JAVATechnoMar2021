package trupti.CodingExam18;

public class ExcludeSixNineaNDSum {
	
	static int getSumexcludeSixNine(int[] arr) {
		int sum=0;
		String flag="start";
		for(int index=0;index<arr.length;index++) {
			if(arr[index]==6) {
				flag="stop";
			}
			if (arr[index]==9) {
				flag="start";
				continue;
			}
			if (flag.equals("start")) {
				sum=sum+arr[index];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
	 int [] input= {2,1,6,9,11,6,19,12,9,2};
	 int output=getSumexcludeSixNine(input);
	 System.out.println("The sum excluding numbers between 6 and 9 is : "+output);

	}

}
