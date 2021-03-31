package ashtha;

class Strudentmarks {
	int marks;
	String nameOfStudent;
	
	void studentName(String name, int studentMarks){
		marks = studentMarks;
		nameOfStudent = name;
		System.out.println("Student name - "+nameOfStudent +" , marks - "+marks);
	}
	
	void gainedMark(){
		if (marks >100 && marks <0){
			System.out.println ("Please enter valid marks");
		}else if (marks >=90){
			System.out.println(nameOfStudent +" recieved grade A+");
		}else if (marks <= 90 && marks >80){
			System.out.println(nameOfStudent +" recieved grade A");
		}else if (marks <=80 && marks >70){
			System.out.println(nameOfStudent +" recieved grade B+");
		}else if (marks <=70 && marks >60){
			System.out.println(nameOfStudent +" recieved grade B");
		}else 
			System.out.println(nameOfStudent +" recieved grade C");
	}
	
	public static void main(String[] args){
		Student student = new Student();
		student.studentName("Astha",80);
		student.gainedMark();
	}	
}