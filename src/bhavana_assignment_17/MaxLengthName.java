package bhavana_assignment_17;
/*return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/


public class MaxLengthName {

	String maxLength(String[] array) {
		int maxLength=array[0].length();
		String name=array[0];
		for(int index=1;index<array.length;index++) {
			if(array[index].length()>maxLength) {
				maxLength=array[index].length();
				name=array[index];
			}
		}
		return name;
	}

	public static void main(String[] args) {
		String[] names= {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		new MaxLengthName().maxLength(names);
		System.out.println("Name with maximun lenght is:"+(new MaxLengthName().maxLength(names)));
	}
}

