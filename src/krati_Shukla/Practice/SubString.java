package krati_Shukla.Practice;

public class SubString {
	
	void output (String[] input){
		String str = "";
		int length = input.length;

		for(int index=0; index<length; index++)
		{
			
			String temp = input[index]; //krati
			str = temp + str; // 
			//if (index != length-1)
				str = str + "_" + temp;
			System.out.println(str);
		}
		
		
	}
	
	public static void main (String[] a) {
		String[] str = {"Krati","Chaturvedi","Krati","Jain"};
		SubString subString = new SubString();
		subString.output(str);
	}

}
