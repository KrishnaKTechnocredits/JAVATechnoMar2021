package pallavi.Assignment_4;
class Student1{
	String StudentName;
	
	void studentName(String name){
		 StudentName=name;
	}
	
	void gainedMark(int mark){
		if(mark>90){
			System.out.println(StudentName +" received grade A+");
		}
		else if(mark>80 && mark<90){
			System.out.println(StudentName +" received grade A");
		}
		else if(mark>70 && mark<80){
			System.out.println(StudentName +" received grade B+ ");
		}
		else if(mark>60 && mark<70){
			System.out.println(StudentName +" received grade B");
		}
		else
			System.out.println(StudentName +" received grade C");
	}
	
	public static void main(String abc[]){
		Student1 student = new Student1();
		student.studentName("Pallavi Raj");
		student.gainedMark(95);
	}
}