package rashmi;
public class Student_1{
	
		String name;
		String grade;
	
	    void studentName(String sname){
			name = sname;
        }
		
		void gainedMark(int mark){
			if(mark > 100 || mark < 0){
			System.out.println("Invalid input");
		}
		
		else if(mark > 90){
			grade = "A+";
		}else if(mark >80 && mark <= 90){
			grade = "A";
		}else if(mark >70 && mark <=80){
			grade = "B+";
		}else if(mark>60 && mark <= 70){
			grade = "B";
		}else{
			grade = "C";
		}
	
		
		
	}
	void display(){
           
			System.out.println(name+ " received grade " +grade);
	}
	
	public static void main(String[] a){
		
		Student_1 s =  new Student_1();
		s.studentName("tina");
		s.gainedMark(90);
		s.display();
		s.studentName("Raj");
		s.gainedMark(56);
		s.display();
	}
}
		