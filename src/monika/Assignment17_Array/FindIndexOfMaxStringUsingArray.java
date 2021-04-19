package monika.Assignment17_Array;
/*Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/
public class FindIndexOfMaxStringUsingArray {
	
	void getIndex(String[] arr) {
		int max = arr[0].length();
		int resultIndex = 0;
		for(int index = 1;index < arr.length;index++) {
			if(max < arr[index].length()) {
			//	max = arr[index].length();
				resultIndex = index;
			}
		}System.out.println("Index of string max length : "+resultIndex);
	}
	
	public static void main(String[] args) {
		FindIndexOfMaxStringUsingArray obj = new FindIndexOfMaxStringUsingArray();
		String[] arr = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		obj.getIndex(arr);
	}

}
