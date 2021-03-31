/*
 *assignment 4 if else ladder for student mark obtained
 */
package purva;

class Student1{
	String sname;
	void studentName(String name){
		sname = name;
		System.out.println("Student name is" +name);
	}
	
	void gainedMark(int marks){
		if(marks > 90)
		    System.out.println(sname +"received grade A+");
	    else if(marks<=90 && marks>80)
			System.out.println(sname +"received grade B+");
		else if(marks <=80 && marks>70)
			System.out.println(sname +"received grade B");
		else if(marks<=70 && marks>60)
			System.out.println(sname +"received grade B");
		else if(marks<60)
			System.out.println(sname +"received grade C");
	}
	
	public static void main(String[] args){
		Student1 student1 =new Student1();
		student1.studentName("Punit");
		student1.gainedMark(79);
		student1.studentName("Nandini");
		student1.gainedMark(91);
	}
}
		
		