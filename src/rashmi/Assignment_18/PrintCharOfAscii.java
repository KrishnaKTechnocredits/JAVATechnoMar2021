//Program 4:  write a program which will print characters between ascii value 97 to 122.

package rashmi.Assignment_18;

public class PrintCharOfAscii {

	void display() {
		System.out.println("Characters between Ascii vaue 97 to 122 : \n");
		for (int num = 97; num <= 122; num++) {
			char ch = (char) num;
			System.out.println(ch);
		}
	}

	public static void main(String[] args) {
		new PrintCharOfAscii().display();
	}
}
