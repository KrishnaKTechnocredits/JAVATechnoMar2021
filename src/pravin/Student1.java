/*Assignment no 4
 * 2.Create a class named as Student, which have methods like below.
a. studentName()
b. gainedMark()

Expectations:
• If student gain mark above 90% display student name with grade A+
• If student gain marks between 80% to 90% display name with grade A
• If student gain marks between 70% to 80% display name with grade B+
• If student gain marks between 60% to 70% display name with grade B
• If student gain marks below 60% display name with grade C

Sample input : Student name - Maulik, mark - 75
Sample output : Maulik received grade B+ */

package pravin;
class Student1 {
	String stdName;

	void studentName(String Name){
		stdName = Name;
	}
	void gainedMark(int Marks){
		if (Marks>90){
			System.out.println(stdName +" received grade A+");
		}else if(Marks<=90 && Marks>80){
			System.out.println(stdName +" received grade A");
		}else if(Marks<=80 && Marks>70){
			System.out.println(stdName +" received grade B+");
		}else if(Marks<=70 && Marks>60){
			System.out.println(stdName +" received grade B");
		}else{
			System.out.println(stdName +" received grade C");
		}
	}
	public static void main(String[]args){
		Student1 student1 = new Student1();
		student1.studentName("Pravin");
		student1.gainedMark(55);
		student1.gainedMark(95);
		student1.gainedMark(65);
		student1.gainedMark(75);
		student1.gainedMark(90);
	}
}
