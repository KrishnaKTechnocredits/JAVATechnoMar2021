package madhavi_Khasbage.IfElseLadderNested;

class Student1
{
	String name;
	int marks;
	
	void studentName(String stdName,int stdMarks){	
		name=stdName;
		marks=stdMarks;
		System.out.println("Student name - "+name +", marks - "+marks);		
	}
	
	void gainedMark(){
		if(marks>=90){
			System.out.println(name + " received grade A+");
		}else if(marks>=80 && marks<=90){
			System.out.println(name + " received grade A");
		}else if(marks>=70 && marks<=80){
			System.out.println(name + " received grade B+");
		}else if(marks>=60 && marks<=70){
			System.out.println(name + " received grade B");
		}else if(marks<=60){
			System.out.println(name + " received grade C");
		}	
	}
	
	public static void main(String[] agrs){
		Student1 student1 =new Student1();
		student1.studentName("Madhavi",65);
		student1.gainedMark();
	}
	
}