package kapil.Collection;

import java.util.ArrayList;

public class CollectionArrayList {

	static int countName(ArrayList<String> arr, String targetName) {
		int count = 0;
		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index).equals("Techno")) {
				count++;
				arr.set(index, "Maulik");
			}
		}
		System.out.println(arr);
		return count;
	}

	public static void main(String[] args) {
		ArrayList<String> nameList = new ArrayList<String>();
		nameList.add("Aashvi");
		nameList.add("Techno");
		nameList.add("Krishna");
		nameList.add("Techno");

		int answer = countName(nameList, "Techno");
		System.out.println(answer);
	}
}
