package madhavi_Khasbage.ArrayPrograms;

/*
Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
*/

public class FindMaxStringIndex {
	int findMaxLengthstring(String[] arr) {
		int indexOfString = 0;
		int cnt=0;
		for (int index1 = 0; index1 < arr.length; index1++) {
			for (int index2 = 0; index2 < arr.length; index2++) {
				if (arr[index1].length() > arr[index2].length()) {
					cnt++;
				}
			}
			if(cnt==(arr.length-1))indexOfString=index1;			
			cnt=0;
		}
		return indexOfString;
	}

	public static void main(String[] args) {
		FindMaxStringIndex findMaxStr = new FindMaxStringIndex();
		String[] array = { "Mumbai", "Aurangabad", "Arunachal Pradesh", "Pune", "Nagpur" };
		int strIndex = findMaxStr.findMaxLengthstring(array);
		System.out.println("Mximum length string is: " + strIndex);
	}
}
