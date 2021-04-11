package meenu.assignment_17;

/*return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits
*/

public class MaxLength {
	
	String getMaximumLength(String[] nameOfPerson) {
	 String maxName = nameOfPerson[0];	
	 int maximumNameLength = nameOfPerson[0].length();
	 for(int index = 1;index < nameOfPerson.length;index++) {
	 	if(maximumNameLength < nameOfPerson[index].length()) {
	 		maximumNameLength = nameOfPerson[index].length();
             maxName = nameOfPerson[index];	
	 		}
	 	}   
	 	return maxName;		 
     }
	

	public static void main(String[] args) {
		String[] nameOfPerson = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		MaxLength maxLength = new MaxLength();
		String name = maxLength.getMaximumLength(nameOfPerson);
		System.out.println("Name with maximum length in array is : "+name);
	}

}
