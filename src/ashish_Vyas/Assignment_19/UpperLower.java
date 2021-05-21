package ashish_Vyas.Assignment_19;

/*Write a method which will return "Techno" if Uppercase character count is higher 
then LowerCase character count, otherwise return "Credits". Print output in main method.
input : TeCHnoSessionS
output : Credits*/

public class UpperLower {

	int upperCount,lowerCount;
	String str="TeCHnoSessionS";
	
	String getCount() {
	for(int index=0;index<str.length();index++) {
		char ch=str.charAt(index);		
			if(Character.isUpperCase(ch))
				upperCount++;
			else
				lowerCount++;
	}
		if(upperCount>lowerCount)
			return "Techno";
		else
			return "Credits";
		
	}
	
	public static void main(String[] args) {
		UpperLower ul=new UpperLower();
		String show=ul.getCount();
		System.out.println(show);
	}
	
}