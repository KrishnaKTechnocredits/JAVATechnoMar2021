package surabhi;
/*
 * Assignment no 4
 * 
 * */
class Student{
	String studentName;
	void studentName(String name){
		studentName=name;
	}
	
	void gainedMark(int mark){
		if(mark>90){
			System.out.println(studentName+ " received grade A+");		   
		}
		else if(mark>80 && mark<=90){
			System.out.println(studentName+ " received grade A");	
		}
		else if(mark>70 && mark<=80){
			System.out.println(studentName+ " received grade B+");	
		}		
		else if(mark>60 && mark<=70){
			System.out.println(studentName+ " received grade B");	
		}	
		else {
			System.out.println(studentName+ " received grade C");	
		}		
	}
	
	public static void main(String[] args){
		Student student=new Student();
 		student.studentName("Surabhi");
		student.gainedMark(70); 
	}
}