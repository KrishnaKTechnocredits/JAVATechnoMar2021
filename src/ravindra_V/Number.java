//Assignment6

package ravindra_V;

class Number {void displayEven(int no) {
	System.out.println("Even numbers are : ");
	for (int i=no; i<=15; i=i+2) {
	System.out.println(i);
	}
}
	
	void displayDiv1(int no) {
	System.out.println("Numbers divisble by 5 are :");
	for (int i = no; no <= 30; no = no+1) {
		if (no%5 == 0)
		{
			System.out.println(+no+ " ");
		}
	}
}
	
	void displaydiv2(int no) {
	for (int i = no; no <= 18; no = no++) {
		if (no%5 == 0 && no%3 ==0){
		System.out.println("Number divisble by 5 & 3 are : " +no+ " ");
		}
	}
}

	void displaydiv3(int no) {
	for (int i = no; no <= 40; no = no+1) {
		if (no%7 == 0){
		System.out.println(no+" is divisble by 7");
		}
		if (no%13 == 0){
			System.out.println(no+" is divisble by 13");
		}	
	}
}
	public static void main(String[] a) {
	Number number = new Number();
	number.displayEven(10);
	number.displayDiv1(10);
	number.displaydiv2(5);
	number.displaydiv3(5);
}

}
