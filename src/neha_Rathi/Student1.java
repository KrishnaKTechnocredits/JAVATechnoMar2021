/*
 * Assignment 4_2
 * Create a class named as Student, which have methods like below.
	a. studentName()
	b. gainedMark()

 */
package neha_Rathi;

class Student1 {
	String sName;

	void studentName(String name) {
		sName = name;
	}

	void gainedMark(double perc) {
		if (perc < 0 || perc > 100) {
			System.out.println(" Invalid Input ");
		} else if (perc > 90) {
			System.out.println(sName + " Received Grade A+");
		} else if (perc <= 90 && perc > 80) {
			System.out.println(sName + " Received Grade A");
		} else if (perc <= 80 && perc > 70) {
			System.out.println(sName + " Received Grade B+");
		} else if (perc <= 70 && perc > 60) {
			System.out.println(sName + " Received Grade B");
		} else {
			System.out.println(sName + " Received Grade C");
		}
	}

	public static void main(String[] args) {
		Student1 student1 = new Student1();
		System.out.println("--------------First Student Information--------------");
		student1.studentName("Pooja");
		student1.gainedMark(93);
		System.out.println("--------------Second Student Information--------------");
		student1.studentName("Mayur");
		student1.gainedMark(-1);
		System.out.println("--------------Third Student Information--------------");
		student1.studentName("saurabh");
		student1.gainedMark(110);
		System.out.println("--------------Fourth Student Information--------------");
		student1.studentName("Yogita");
		student1.gainedMark(55);
	}
}