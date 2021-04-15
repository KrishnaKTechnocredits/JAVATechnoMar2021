package bhavana_assignment_18;

/*write a method which will print ascii value of A to Z*/

public class AsciiOfAtoZ {
	char ch;
	void getAscii() {
		for(int index=65;index<=90;index++) {
		ch=(char)Character.toUpperCase(index);
		System.out.println(" The ascii of "+index+" is: "+ch);
		}
	}
	
	public static void main(String[] args) {
		AsciiOfAtoZ ac=new AsciiOfAtoZ();
		ac.getAscii();
	}
}
