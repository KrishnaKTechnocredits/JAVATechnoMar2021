package madhavi_Khasbage.ArrayPrograms;

/*
Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits
*/

public class FindMaxStringLength {

	String findMaxLengthstring(String[] arr) {
		String longString = "";
		int cnt=0;
		for (int index1 = 0; index1 < arr.length; index1++) {
			for (int index2 = 0; index2 < arr.length; index2++) {
				if (arr[index1].length() > arr[index2].length()) {
					cnt++;
				}
			}
			if(cnt==(arr.length-1))longString=arr[index1];			
			cnt=0;
		}
		return longString;
	}

	public static void main(String[] args) {
		FindMaxStringLength findMaxStr = new FindMaxStringLength();
		String[] array = { "Mumbai", "Aurangabad", "Amravati", "Pune", "Nagpur" };
		String name = findMaxStr.findMaxLengthstring(array);
		System.out.println("Mximum length string is: " + name);
	}
}
