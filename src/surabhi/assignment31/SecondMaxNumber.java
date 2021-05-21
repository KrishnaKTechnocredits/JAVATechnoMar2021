package surabhi.assignment31;

/*WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 */

public class SecondMaxNumber {
	void getSecMaxNumber(int[] arr) {
		int max=arr[0];int count=0;
		for(int index=1;index<arr.length;index++) {
			if(max<arr[index]) {
				max=arr[index];
				count++;
			}
		}
		if(count>0) {
			System.out.println(arr[--count]);
		}else
			System.out.println(arr[count]);
	}

	public static void main(String[] args) {
		SecondMaxNumber secondMaxNumber=new SecondMaxNumber();
		int [] arr= {10,33,43,55,97,11,3};
		secondMaxNumber.getSecMaxNumber(arr);

	}

}
