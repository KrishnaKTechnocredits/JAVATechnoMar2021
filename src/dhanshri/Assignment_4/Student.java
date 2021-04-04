package dhanshri.Assignment_4;

public class Student{
	String stuName;
	
	void studentName(String sname){
		stuName = sname;
	}
	
	void gainedMark(int mark){
	    if (mark>90){
		    System.out.println(stuName +" received grade A+");
	    }else if (mark>80 && mark<=90){
		    System.out.println(stuName +" received grade A");
		}else if (mark>70 && mark<=80){
			System.out.println(stuName +" received grade B+");
		}else if (mark>60 && mark<=70){
			System.out.println(stuName +" received grade B");
		}else{
			System.out.println(stuName +" received grade C");
		}
	}
	
	public static void main(String[] args){
		Student student = new Student();
		student.studentName("Dhanshri");
		student.gainedMark(95);
		student.gainedMark(83);
		student.gainedMark(77);
		student.gainedMark(69);
		student.gainedMark(53);
	}
	
}