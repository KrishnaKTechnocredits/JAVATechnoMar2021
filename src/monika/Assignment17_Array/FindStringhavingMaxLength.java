package monika.Assignment17_Array;
/*Program 8: return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits

*
*
*/
public class FindStringhavingMaxLength {

	String getMaxString(String[] arr) {
		int max = arr[0].length();
		String string = arr[0];
		for(int index=1;index<arr.length;index++) {
			if(max < arr[index].length()) {
		//		max = arr[index].length();
				string = arr[index];
			}
		}
		return string;
	}
	public static void main(String[] args) {
		FindStringhavingMaxLength obj = new FindStringhavingMaxLength();
		String[] arr = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		System.out.println(obj.getMaxString(arr));
	}
}
