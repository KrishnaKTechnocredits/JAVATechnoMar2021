package rikin.assignment4;

class Student{
	String studentName;
	
	void studentName(String nameOfStudent){
		studentName = nameOfStudent;
	}
	
	void gainedMark(int mark){
		if(mark > 100 || mark < 0){
			System.out.println("Invalid Input");
		}else if(mark > 90){													
			System.out.println(studentName + " received grade A+"); 
		}else if(mark <= 90 && mark > 80){
			System.out.println(studentName + " received grade A"); 
		}else if(mark <= 80 && mark > 70){
			System.out.println(studentName + " received grade B+"); 
		}else if(mark <= 70 && mark > 60){
			System.out.println(studentName + " received grade B"); 
		}else if(mark <=60){
			System.out.println(studentName + " received grade C"); 
		}	
	}
	
	public static void main(String [] args){
		Student student = new Student();
		student.studentName("Rikin");
		student.gainedMark(101);
		student.gainedMark(90);
		student.gainedMark(80);
		student.gainedMark(70);
		student.gainedMark(50);		
	}
}