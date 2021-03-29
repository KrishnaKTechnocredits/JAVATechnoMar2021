package sai;

class StudentReport{

	String studentNameIs;
	
	void studentName(String name){
		studentNameIs = name;
	}

	void gainedMark(int marks){
		if(marks>=90){
			System.out.println(studentNameIs + " received A+");
		}
		else if(marks>=80 && marks<90){
			System.out.println(studentNameIs + " received A");
		}
		else if(marks>=70 && marks<80){
			System.out.println(studentNameIs + " received B+");
		}
		else if(marks>=60 && marks<70){
			System.out.println(studentNameIs + " received B");
		}
		else if(marks<60){
			System.out.println(studentNameIs + " received C");
		}
	}
		
	public static void main(String[] args){
		StudentReport studentReport  = new StudentReport();
		studentReport.studentName("Sai Krishna");
		studentReport.gainedMark(90);
		studentReport.studentName("Sai Krishna");
		studentReport.gainedMark(80);
	}
}