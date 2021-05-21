package milind.Assignment_19;

public class CountUpperLowerChar {
	
	String getCount(String input) {
		int upperCaseCount=0,lowerCaseCount=0;
		
		for(int index=0;index < input.length();index++) {
			char ch=input.charAt(index);
			
			if(Character.isUpperCase(ch))
				upperCaseCount++;
			else
				lowerCaseCount++;
		}
		System.out.println("Count of UpperCase Character = "+upperCaseCount);
		System.out.println("Count of LowerCase Character = "+lowerCaseCount);
		
		if(upperCaseCount > lowerCaseCount)
			return "Techno";
		else 
			return "Credits";
	}
	public static void main(String[] args) {
		String input ="TeCHnoSessionS";
		String ans=new CountUpperLowerChar().getCount(input);
		System.out.println("Return : "+ans);
	}

}
