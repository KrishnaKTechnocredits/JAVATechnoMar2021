package sourabh;

class StudentMarks{
	String name;
	void studentName(String studentName){
		name= studentName;
	}
	void gainedMark(int mark){
		if(mark>90)
			System.out.println(name+" received grade A+");
		else if(mark<=90 && mark>=80)
			System.out.println(name+" received grade A");
		else if(mark<80 && mark>=70)
			System.out.println(name+" received grade B+");
		else if(mark<70 && mark>=60)
			System.out.println(name+" received grade B");	
		else
			System.out.println(name+" received grade C");
	}
	public static void main(String[] args){
		StudentMarks studentmarks= new StudentMarks();
		studentmarks.studentName("Sourabh");
		studentmarks.gainedMark(79);
	}
}