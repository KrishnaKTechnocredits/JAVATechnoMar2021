 package madhavi_Raut.Assignment_17;
/*Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88*/
 
public class FindMaxNumber {
	
	void findMaxNumber(int[] num) {
		int maxNum = num[0];
		for(int index=1; index<num.length; index++) {
			if(num[index] > maxNum)
				maxNum = num[index];
		}
		System.out.println("Max number in given array is :"+maxNum);
	}
	public static void main(String[] args) {
		int[] num = {22,35,65,88,11,23,45};
		new FindMaxNumber().findMaxNumber(num);
	}
}
