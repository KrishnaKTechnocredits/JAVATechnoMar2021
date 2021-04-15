package mayur.assignment17;

public class MinNumber {
	void findMin(int[] num) {
		int minNum = num[0];
		for(int index=1; index<num.length; index++) {
			if(num[index] < minNum)
				minNum = num[index];
		}
		System.out.println("Min number in given array is :"+minNum);
	}
	public static void main(String[] args) {
		MinNumber min = new MinNumber();
		int[] num = {22,35,65,88,11,23,45};
		min.findMin(num);
	}

}
