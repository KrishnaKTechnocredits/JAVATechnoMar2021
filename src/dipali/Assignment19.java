package dipali;

public class Assignment19 {
	
	public String getDetails(String input) {
		int asciiUpper=0;
		int asciilower=0;
		if(input!=null) {
			int len=input.length();
			
			int ascii=0;
			for(int cnt=0;cnt<len;cnt++) {
				ascii =ascii+(int) input.charAt(cnt);
				if(ascii>65 || ascii==65) {
					asciiUpper =ascii+(int) input.charAt(cnt);
				}else {
					asciilower =ascii+(int) input.charAt(cnt);
				}	
			}	
		}
			if(asciiUpper >asciilower )
					return "Techno";
			else
				return "Credits";
	}

	public static void main(String[] args) {
		Assignment19 assignment19=new Assignment19();
		String name=assignment19.getDetails("TeCHnoSessionS");
		System.out.println(name);
	}

}
