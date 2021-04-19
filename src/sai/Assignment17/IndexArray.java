package sai.Assignment17;

public class IndexArray {

	public static void main(String[] args) {
		IndexArray indexArray = new IndexArray();
		String[] names = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		indexArray.indexNumber(names);
	}

	void indexNumber(String[] names) {
		int maxLength = names[0].length();
		int indexNum = 0;
		for (int index = 0; index < names.length; index++) {
			if (names[index].length() > maxLength) {
				indexNum = names[index].length();
				indexNum = index;
			}
		}
		System.out.println("Index having maximum length from given string array is " + indexNum);
	}

}
