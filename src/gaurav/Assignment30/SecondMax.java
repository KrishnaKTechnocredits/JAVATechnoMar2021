package gaurav.Assignment30;

import java.util.Arrays;

public class SecondMax {
	public static void main(String args[]) {
		int array[] = { 10, 33, 43, 55, 97, 11, 3 };
		int size = array.length;
		Arrays.sort(array);
		System.out.println("sorted Array ::" + Arrays.toString(array));
		int res = array[size - 2];
		System.out.println("2nd largest element is ::" + res);
	}
}
