package ami.Assignment_4;

/*
 * 2. Create a class named as Student, which have methods like below.
a. studentName()
b. gainedMark()
Expectations:
• If student gain mark above 90% display student name with grade A+
• If student gain marks between 80% to 90% display name with grade A
• If student gain marks between 70% to 80% display name with grade B+
• If student gain marks between 60% to 70% display name with grade B
• If student gain marks below 60% display name with grade C
*/

public class Student {
	/*String name;
	
	void studentName(String Name) {
		name = Name;	
	}
	*/
	void gainedMark(String Name , int gain) {
		if (gain > 90)
			System.out.println(Name + " received grade A+");
		if(gain > 80 && gain < 90)
			System.out.println(Name + " received grade A");
		if(gain > 70 && gain < 80)
			System.out.println(Name + " received grade B+");
		if(gain > 60 && gain < 70)
			System.out.println(Name + " received grade B");
		if(gain < 60 )
			System.out.println(Name +" received grade B");

  }
    public static void main(String[] a) {
		Student student = new Student();
		//student.studentName("Maulik");
		student.gainedMark("maulik", 98);
	}

}
