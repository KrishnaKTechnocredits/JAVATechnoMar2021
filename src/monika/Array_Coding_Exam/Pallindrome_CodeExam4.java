package monika.Array_Coding_Exam;

/*Programming Test - 4 : 12th May'2021
String input = "Hi MAM hello NamaN techno";
output : MAM NamaN*/
public class Pallindrome_CodeExam4 {
	static String[] getPallindrome(String s) {
		String[] arr = s.split(" ");
		String[] resultArr = new String[arr.length];
		boolean flag = false;
		int count = 0;
		for(int index=0;index<arr.length;index++) {
			if(arr[index].charAt(0) == arr[index].charAt(arr[index].length()-1)){
				for (int startindex = 0, lastIndex = arr[index].length() - 1; startindex <= lastIndex; startindex++, lastIndex--) {
					if (s.charAt(startindex) == s.charAt(lastIndex))
						flag = true;
					else
						flag = false;
				}
			}
			if (flag) {
				resultArr[count] = arr[index];
				count++;
				flag = false;
			}
		}
		return resultArr;
	}

	public static void main(String[] args) {
		String[] arr = new String[5];
		arr = getPallindrome("Hi MAM hello NamaN techno");
		System.out.println(arr[0] + " " + arr[1]);
	}

}
