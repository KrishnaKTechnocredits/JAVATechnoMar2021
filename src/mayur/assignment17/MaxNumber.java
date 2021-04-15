package mayur.assignment17;

public class MaxNumber {
	void findMax(int[] num) {
		int maxNum = num[0];
		for(int index=1; index<num.length; index++) {
			if(num[index] > maxNum)
				maxNum = num[index];
		}
		System.out.println("Max number in given array is :"+maxNum);
	}
	public static void main(String[] args) {
		MaxNumber max = new MaxNumber();
		int[] num = {22,35,65,88,11,23,45};
		max.findMax(num);
	}

}
