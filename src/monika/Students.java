package monika;

/*Assignment 4 : 25th March 2021

2. Create a class named as Student, which have methods like below.
a. studentName()
b. gainedMark()

Expectations:
• If student gain mark above 90% display student name with grade A+
• If student gain marks between 80% to 90% display name with grade A
• If student gain marks between 70% to 80% display name with grade B+
• If student gain marks between 60% to 70% display name with grade B
• If student gain marks below 60% display name with grade C

Sample input : Student name - Maulik, mark - 75
Sample output : Maulik received grade B+*/

class Students{
String name;
void studentName(String studentName){
	name = studentName;
}
void gainedMark(int mark){
	if(mark>90)
		System.out.println(name+" scored grade A+");
	else if(mark<=90 && mark >= 80)
		System.out.println(name+" scored grade A");
	else if(mark<80 && mark >=70)	
		System.out.println(name+" scored grade B+");
	else if(mark<70 && mark>=60)
		System.out.println(name+" scored grade B");
	else
		System.out.println(name+" scored grade C");
}
public static void main(String[] args){
	Students student = new Students();
	student.studentName("Monika");
	student.gainedMark(71);
}
}