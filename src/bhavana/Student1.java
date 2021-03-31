package bhavana;
class Student1{
	String studentName;
	
	void studentName(String name){
		studentName=name;
	}
	void gainedMarks(int marks){
		if(marks>90){
			System.out.println(studentName + " received grade A+");
		}else if(marks>80 && marks<=90){
			System.out.println(studentName + " received grade A");
		}else if(marks>70 && marks<=80){
			System.out.println(studentName + " received grade B+");
		}else if(marks>60 && marks<=70){
			System.out.println(studentName + " received grade B");
		}else if(marks<=60){
			System.out.println(studentName + " received grade C");
		}
	}	
		
	public static void main(String[] args){
		Student1 st=new Student1();
		st.studentName("Maulik");
		st.gainedMarks(75);
	}	
}











