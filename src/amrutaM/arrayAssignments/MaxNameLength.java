package amrutaM.arrayAssignments;

/*Array Program 8: return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits
*/
public class MaxNameLength {

	String getMaxLength(String [] input) {
		String maxName = input[0];
		for(int index = 1; index < input.length;index++) {
			if(maxName.length() <input[index].length()) {
				maxName = input[index];
			}
		}
		return maxName;
	}
	
	public static void main(String[] args) {
		MaxNameLength maxNameLength = new MaxNameLength();
		String []names = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		String name = maxNameLength.getMaxLength(names);
		System.out.println("Name with maximum length is --> "+name);
	}

}
