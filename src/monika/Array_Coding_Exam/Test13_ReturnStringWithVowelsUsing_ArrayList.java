package monika.Array_Coding_Exam;
import java.util.ArrayList;

/*2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"] a,e,i,o,u
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}*/
public class Test13_ReturnStringWithVowelsUsing_ArrayList {
	
	public ArrayList<String> getStringsWithVowel(String[] arr) {
		ArrayList<String> arrList = new ArrayList<String>();
		for (String s : arr) {
			int count = 0;
			String temp = s;
			while (temp.contains("a") || temp.contains("e") || temp.contains("i") || temp.contains("o")
					|| temp.contains("u")) {
				if (temp.contains("a")) {
					count++;
					temp = temp.replaceFirst("a", "");
					if (count == 3)
						break;
				}
				if (s.contains("e")) {
					count++;
					temp = temp.replaceFirst("e", "");
					if (count == 3)
						break;
				}
				if (s.contains("i")) {
					count++;
					temp = temp.replaceFirst("i", "");
					if (count == 3)
						break;
				}
				if (s.contains("o")) {
					count++;
					temp = temp.replaceFirst("o", "");
					if (count == 3)
						break;
				}
				if (s.contains("u")) {
					count++;
					temp = temp.replaceFirst("u", "");
					if (count == 3)
						break;
				}
			} // whileloop
			if (count == 3) {
				arrList.add(s);
				count = 0;
			}
		} // forloop
		return arrList;
	}

	public static void main(String[] args) {
		Test13_ReturnStringWithVowelsUsing_ArrayList obj = new Test13_ReturnStringWithVowelsUsing_ArrayList();
		String[] arr = { "aashay", "sandesh", "madhavi", "ankit", "ami", "priyanka" };
		ArrayList<String> arrList = obj.getStringsWithVowel(arr);
		System.out.println(arrList);
		String s = "aashay";
	}
}
