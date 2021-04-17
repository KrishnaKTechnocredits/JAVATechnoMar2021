//rogram 4:  write a program which will print characters between ascii value 97 to 122.

package neha_Rathi.assignment18;

public class GetCharcterFromAscii {
	
	void charValueFromAscii() {
		for(int num=97;num<=122;num++) {
			System.out.println(num+" is ASCII value of character "+(char) num);
		}
	}
	
	public static void main(String[] args) {
		GetCharcterFromAscii getCharcterFromAscii = new GetCharcterFromAscii();
		getCharcterFromAscii.charValueFromAscii();
	}
}
