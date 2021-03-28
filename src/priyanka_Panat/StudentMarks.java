package priyanka_Panat;
/*
 Assignment 4
 */
class StudentMarks{
	String studentname;
	
	void studentName(String name){
		studentname=name;
	}
	
	void gainedMarks(int marks){
		if(marks>90){
			System.out.println(studentname + " received grade A+");
		}
		else if(marks>80 && marks<=90){
			System.out.println(studentname + " received grade A");
		}
		else if(marks>70 && marks<=80){
			System.out.println(studentname + " received grade B+");
		}
		else if(marks>60 && marks<=70){
			System.out.println(studentname + " received grade B");
		}
		else if(marks<60){
			System.out.println(studentname + " received grade C");
		}
	}
	
	public static void main(String[] args){
		StudentMarks s1= new StudentMarks();
		s1.studentName("Priyanka");
		s1.gainedMarks(75);
		s1.studentName("Yogita");
		s1.gainedMarks(96);
		s1.studentName("Shreyash");
		s1.gainedMarks(85);
		s1.studentName("Swati");
		s1.gainedMarks(66);
		s1.studentName("Rohit");
		s1.gainedMarks(45);
	}
}
		
	
	