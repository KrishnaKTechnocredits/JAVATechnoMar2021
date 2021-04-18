/*Program 3: write a method which will print ascii value of A to Z*/

package pravin.Assignment_18;
public class AsciivaluesAToZ {
	void chartoAscii() {
		for (char ch = 'A'; ch <= 'Z'; ch++) {
			int num = ch;
			System.out.println(num);
		}
	}
	public static void main(String[] args) {
		new AsciivaluesAToZ().chartoAscii();
	}
}