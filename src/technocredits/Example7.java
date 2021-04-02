package technocredits;

public class Example7 {
	String name; // null
	static double price; // 93.23
	static char qGrade = 'A';
	
	public static void main(String[] args) {
		Example7 example7 = new Example7();
		example7.price = 93.23;
		example7.name = "Techno";
		example7.qGrade = 'B';
		Example7 example7_1 = new Example7();
		example7_1.qGrade = 'C';
		example7.qGrade = 'D';
		System.out.println(example7_1.name + "-" + example7_1.price + "-" + example7_1.qGrade);
	}

}
