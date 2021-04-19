package monali;

public class Program_1 {

	int indicesOfNums(int[] arr,int targetnum) {
		int answer = 0;
		int[] output = new int[arr.length];
		for (int index = 0; index < arr.length; index++) {
			for(int i = index + 1; i < arr.length; i++) {
			if(arr[index]+arr[i]==targetnum) {
					System.out.println(arr[index] + " " + arr[i]);
				answer =arr[index]+arr[i];
				System.out.println("additoin of two indices is "+answer);
			}
		}
	}
		return answer;

	}
	
	public static void main(String[] args) {
		Program_1 program = new Program_1();
		int[] arr = {33,67,40,45};
		program.indicesOfNums(arr,85);
	}

}
