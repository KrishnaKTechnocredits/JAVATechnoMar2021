// reverse String "hi hello how are you"

package monali.coding_exam_5_15mins;

public class ReverseString {

	String getReverseString(String name) {
		StringBuffer sb = new StringBuffer(name);
		sb = sb.reverse();
		return sb.toString();

	}

	void reverse(String name) {
		String output = " ";
		String[] arr = name.split(" ");
		for (int index = 0; index < arr.length; index++) {
			String reverseName = getReverseString(arr[index]);
			output = output + reverseName + " ";
		}
		System.out.println(output.trim());

	}

	public static void main(String[] args) {
		ReverseString name = new ReverseString();
		name.reverse("hi hello how are you");
	}

}
