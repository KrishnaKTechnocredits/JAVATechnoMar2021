package prachi.Assignment_17;

/*Program 8:  return the name having maximum length.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : Technocredits*/

public class ArrStringName {
	String findMaxLengthName(String[] stringArr) {
		String maxName=stringArr[0];
		int maximumNameLength = stringArr[0].length();	
		for(int index = 1;index < stringArr.length;index++) {
			if(maximumNameLength < stringArr[index].length()) {
				maximumNameLength = stringArr[index].length();
				maxName = stringArr[index];	
			}
		}   
		return maxName;
	}

	public static void main(String[] args) {
		ArrStringName maxname=new ArrStringName();
		String[] stringArr = {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		String strName = maxname.findMaxLengthName(stringArr);
		System.out.println("Output : "+strName);		
	}
}
