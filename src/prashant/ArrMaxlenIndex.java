//return the index having maximum length from given string array.
//input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
//output : 2

package prashant;

public class ArrMaxlenIndex {

	int dispMaxlenindex(String[] Name) {
		int maxindex = 0;
		for (int i = 0; i < Name.length; i = i + 1) {
			if (Name[maxindex].length() < Name[i].length()) {
				maxindex = i;
			}
		}
		return maxindex;
	}

	public static void main(String[] args) {
		String[] Name = { "Maulik", "Krishna", "Technocredits", "Kangan", "Harsh" };
		int maxindex = new ArrMaxlenIndex().dispMaxlenindex(Name);
		System.out.println(maxindex);
	}

}
