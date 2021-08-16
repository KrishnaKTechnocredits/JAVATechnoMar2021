package amrutaM.arrayAssignments;

/*program 1*:  
wap that will return difference of even length name and odd length name. 
arr[0] = "Maulik"; 		 
arr[1] = "Techno"; 		 
arr[2] = "Nidhi"; 		 
arr[3] = "Ankit";  

output : 2 */
public class Assignment15Program1 {
	int getNameLengthDiff(String[] names) {
		int evenNameLength = 0, oddNameLength = 0;
		for (int index = 0; index < names.length; index++) {
			if (names[index].length() % 2 == 0) {
				evenNameLength += names[index].length();
			} else if (names[index].length() % 2 != 0) {
				oddNameLength += names[index].length();
			}
		}
		return evenNameLength - oddNameLength;
	}

	public static void main(String[] args) {
		String[] names = { "Maulik", "Techno", "Nidhi", "Ankit" };
		Assignment15Program1 assignment15Program1 = new Assignment15Program1();
		int diff = assignment15Program1.getNameLengthDiff(names);
		System.out.println("Difference between even length name and odd length name is --> "+diff);
	}
}
