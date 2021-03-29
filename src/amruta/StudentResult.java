package amruta;

class StudentResult{
	String studname;
	
	void studentName(String name){
		studname = name;
	}	
	void gainedMarks(int marks){
		if(marks>90){
			System.out.println(studname +" Received Grade A+ ");
			System.out.println("------------------------------------------");
		}else if(marks>80 && marks<=90){
			System.out.println(studname +" Received Grade A ");
			System.out.println("------------------------------------------");
		}else if(marks>70 && marks<=80){
			System.out.println(studname +" Received Grade B+ ");
			System.out.println("------------------------------------------");
		}else if(marks>60 && marks<=70){
			System.out.println(studname +" Received Grade B ");
			System.out.println("------------------------------------------");
		}else if(marks<60){
			System.out.println(studname +" Received Grade C ");
		}
		
	}	
	public static void main(String[] args){
		StudentResult studentresult = new StudentResult();
		studentresult.studentName("Vrushali");
		studentresult.gainedMarks(91);
		studentresult.studentName("Vishal");
		studentresult.gainedMarks(86);
		studentresult.studentName("Monika");
		studentresult.gainedMarks(73);
		studentresult.studentName("Kunika");
		studentresult.gainedMarks(62);
		studentresult.studentName("Kunal");
		studentresult.gainedMarks(55);
	}
}