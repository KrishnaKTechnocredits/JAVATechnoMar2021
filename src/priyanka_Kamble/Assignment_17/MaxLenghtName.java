package priyanka_Kamble.Assignment_17;
/*
Program 8: return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangankangankangan", "Harsh"};
output : Technocredits */

/*Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/
public class MaxLenghtName {
	
	void maxLenghth (String[] array) {
		int count=0; String maxStr ="";
		for(int index=0;index<array.length -1;index++) {
			if(array[index].length()< array[index+1].length() ) {
				//array[index] = array[index+1];
				maxStr = array[index+1];
				count=index+1;
			}
		}
		System.out.println(" Max Lengh Name - "+maxStr + " is present at index - "+ count );
	}
	
	public static void main(String[] args) {
		String [] array= {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		new MaxLenghtName().maxLenghth(array);
	}
}
