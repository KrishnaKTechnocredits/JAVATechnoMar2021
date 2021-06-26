package neha_Rathi.JavaCodeExam;

public class JavaTest {

	static int reaarange(int[] arr) {
		int sum = 0;
		boolean flag = true;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 6) 
				flag = false;
			if (arr[index] == 9) {
				flag = true;
				continue;
			}
			if (flag) 
				sum += arr[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 7, 9, 2, 3, 6, 8, 6, 9, 2 };
		System.out.println(reaarange(arr));
	}
}
