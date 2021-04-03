package simmi;

class Student{
	
	String studentName;
		void studentName(String name){
			studentName = name;
		}
		void gainedMark(int marks){
		if(marks > 100 || marks < 0){
			System.out.println("Invalid marks");
		}
		else if(marks > 90 ){
			System.out.println("Student name is " + studentName + " and she scored A+ ");
		}
		else if(marks <= 90 && marks > 80){
			System.out.println("Student name is " + studentName + " and she scored A ");
		}
		else if(marks <= 80 && marks > 70){
			System.out.println("Student name is " + studentName + " and she scored B+ ");
		}
		else if(marks <= 70 && marks > 60){
			System.out.println("Student name is " + studentName + " and she scored B ");
		}
		else {
			System.out.println("Student name is " + studentName + " and she scored C ");
		}
	}

	public static void main(String[] args){
		Student student = new Student();
		student.studentName("Simmi");
		student.gainedMark(7);
		student.studentName("Upasana");
		student.gainedMark(95);
		student.studentName("Pallavi");
		student.gainedMark(100);
	}
}