//Assignment 4

package ravindra_V;

class Student{
	String stName;
	
	void studentName(String name){
		stName = name;
	}

	void gainedMark(double percentage){
		if(percentage > 90){
			System.out.println(stName+" Received grade A+");
		} else if(percentage <=90 && percentage >80){
			System.out.println(stName+" Received grade A");
		}else if(percentage <=80 && percentage >70){
			System.out.println(stName+" Received grade B+");
		}else if(percentage <=70 && percentage >60){
			System.out.println(stName+"Received grade B");
		}else
			System.out.println(stName+" Received grade C");
	}
	
	public static void main(String[] args){
		Student student = new Student();
		student.studentName("Ravindra");
		student.gainedMark(95);
		student.studentName("Vinay");
		student.gainedMark(85.5);
		student.studentName("Kush");
		student.gainedMark(75.5);
		student.studentName("Amit");
		student.gainedMark(65.5);
		student.studentName("Pratik");
		student.gainedMark(55.5);
	}
}