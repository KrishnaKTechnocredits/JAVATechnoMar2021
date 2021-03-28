package shivani;

class Human {
	String name;
	boolean canSpeak;
	int age;

	void humanName(String huName) {
		name = huName;
	}

	void canSpeak(boolean flag) {
		canSpeak = flag;
	}

	void humanAge(int huAge) {
		age = huAge;
	}

	void showDetails() {
		System.out.println("Human name is = " + name);
		System.out.println(" He can speak = " + canSpeak);
		System.out.println(" Human age is = " + age);
	}

	public static void main(String[] args) {
		Human human1 = new Human();
		human1.humanName("Ram");
		human1.canSpeak(true);
		human1.humanAge(20);
		human1.showDetails();
	}

}
