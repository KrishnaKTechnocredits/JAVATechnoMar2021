//Assignment 4

package radha;

class Student{
	String studName;
	
	void studentName(String sName){
		studName = sName;
	}
	
	void gainedMark(int marks){
		if(marks > 90){
			System.out.println(studName + " has received grade A+.");
		}else if(marks <= 90 && marks > 80){
			System.out.println(studName + " has received grade A.");
		}else if(marks <= 80 && marks > 70){
			System.out.println(studName + " has received grade B+.");
		}else if(marks <= 70 && marks > 60){
			System.out.println(studName + " has received grade B.");
		}else{
			System.out.println(studName + " has received grade C.");
		}
	}
	
	public static void main(String[] args){
		Student student = new Student();
		student.studentName("Riya");
		student.gainedMark(98);
		student.studentName("Isha");
		student.gainedMark(81);
		student.studentName("Rahul");
		student.gainedMark(80);
		student.studentName("Sona");
		student.gainedMark(65);
		student.studentName("Atharv");
		student.gainedMark(52);
	}
}