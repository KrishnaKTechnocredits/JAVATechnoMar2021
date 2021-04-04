/*	2. Create a class named as Student, which have methods like below.
a. studentName()
b. gainedMark()

Expectations:
• If student gain mark above 90% display student name with grade A+
• If student gain marks between 80% to 90% display name with grade A
• If student gain marks between 70% to 80% display name with grade B+
• If student gain marks between 60% to 70% display name with grade B
• If student gain marks below 60% display name with grade C
Sample input : Student name - Maulik, mark - 75
Sample output : Maulik received grade B+
From today onwards will give you comments on only Logic. If  your code is not as per points given by me then I will not going to review it.
 */
package ravindra_J.Assignment_no_1_5;	

class Student1{
	String stdName;
	void studentName(String name){
		stdName = name;
	}

	void gainedMark(double mark){

		if(mark >=101 && mark >=0) {
			System.out.println(stdName+" mark should not be greater than 100 less than 0");
		}
		else if(mark <=100 && mark >= 90){
			System.out.println(stdName+ " received grade A+");	
		}
		else if(mark <= 90 && mark >= 80){
			System.out.println(stdName+ " received grade A");	
		}
		else if(mark <= 80 && mark >= 70){
			System.out.println(stdName+ " received grade B+");	
		}
		else if(mark <= 70 && mark >= 60){
			System.out.println(stdName+ " received grade B");	
		}
		else if(mark < 60 && mark >= 45){
			System.out.println(stdName+ " received grade C");	
		}
		else 
			System.out.println(stdName+ " is Fail....need more practice");
	}

	public static void main(String []args){
		Student1 student1 = new Student1();
		student1.studentName("Linda");
		student1.gainedMark(43.63);
		student1.studentName("Laila");
		student1.gainedMark(106);
		student1.studentName("Alok");
		student1.gainedMark(78);
		student1.studentName("Maria");
		student1.gainedMark(84.45);
		student1.studentName("Lisa");
		student1.gainedMark(59.99);
	}
}