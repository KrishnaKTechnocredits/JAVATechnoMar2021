package neha_Rathi.assignment1;

class Student {
	int age = 19;
	String name = "Neha";

	void showData() {
		System.out.println("age is " + age + " and name is " + name);
		System.out.println(name);
	}

	public static void main(String[] args) {
		Student s1 = new Student();
		s1.showData();
		System.out.println(s1.age + s1.name);
		System.out.println(s1);
	}
}
