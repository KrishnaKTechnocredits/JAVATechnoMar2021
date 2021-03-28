/*3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  a.humanName()  b.canSpeak()  c.humanAge()  d.showDetails() 
Hint: One String, one boolean, one int variable needed. 
*/
package aparna;

class Human {

	String humanName;
	boolean humanCanSpeak;
	int humanAge;

	void humanName(String name) {
		humanName = name;

	}

	void canSpeak(boolean flag) {
		humanCanSpeak = flag;

	}

	void humanAge(int age) {
		humanAge = age;

	}

	void showDetails() {
		System.out.println("Human Name is " + humanName + ", " + "Human age is " + humanAge + " and "
				+ "Is Human Can speak is " + humanCanSpeak);

	}

	public static void main(String[] args) {
		Human human = new Human();
		human.humanName("Jyoti Singh Baghel");
		human.humanAge(25);
		human.canSpeak(true);
		human.showDetails();
	}
}