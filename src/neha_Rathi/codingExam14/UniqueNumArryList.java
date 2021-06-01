package neha_Rathi.codingExam14;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueNumArryList {

	public static ArrayList<Integer> getUniqueNumbers(int[] words) {
		Set<Integer> set1 = new LinkedHashSet<Integer>();
		for (int num : words) {
			set1.add(num);
		}
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int num2 : set1) {
			list.add(num2);
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		System.out.println(getUniqueNumbers(arr));
	}
}
