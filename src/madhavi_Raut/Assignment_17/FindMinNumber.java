package madhavi_Raut.Assignment_17;
/*Program 6: From given array return min number.
input : 22,35,65,88,11,23,45
output : 88*/
 
public class FindMinNumber {
	
	void findMinNumber(int[] num) {
		int minNum = num[0];
		for(int index=1; index<num.length; index++) {
			if(num[index] < minNum)
				minNum = num[index];
		}
		System.out.println("Min number in given array is :"+minNum);
	}
	
	public static void main(String[] args) {
		int[] num = {22,35,65,88,11,23,45};
		new FindMinNumber().findMinNumber(num);
	}
}
