//Program 3:  write a method which will print ascii value of A to Z.

package neha_Rathi.assignment18;

public class AsciiAToZ {
	
	void AsciiAToZValue() {
		int num=0;
		for(char ch='A';ch<='Z';ch++) {
			num=ch;
			System.out.println(ch+" ASCII value is "+num);
		}
	}
	
	public static void main(String[] args) {
		AsciiAToZ asciiAToZ= new AsciiAToZ();
		asciiAToZ.AsciiAToZValue();
	}
}
