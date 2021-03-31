package bhushan;
class Student1{
	String studName;
	int stuMarks;
	void studentName(String sName){
		studName = sName;
	}
	void gainedMark(int sMarks){
		stuMarks = sMarks;
			if(stuMarks>90){
			System.out.println(studName+" received grade A+");					
			}
			else if(stuMarks<=90 && stuMarks>=80){
			System.out.println(studName+" received grade A");					
			}
			else if(stuMarks<=80 && stuMarks>=70){
			System.out.println(studName+" received grade B+");					
			}
			else if(stuMarks<=70 && stuMarks>=60){
			System.out.println(studName+" received grade B");					
			}
			else {
			System.out.println(studName+" received grade C");					
			}			
	}
	public static void main(String[] args){
		Student1 s1 = new Student1();
		s1.studentName("John");
		s1.gainedMark(72);
		Student1 s2 = new Student1();
		s2.studentName("Rohan");
		s2.gainedMark(45);
		Student1 s3 = new Student1();
		s3.studentName("Santosh");
		s3.gainedMark(92);
		Student1 s4 = new Student1();
		s4.studentName("Mohan");
		s4.gainedMark(62);
		Student1 s5 = new Student1();
		s5.studentName("Raghav");
		s5.gainedMark(85);
	}
}	