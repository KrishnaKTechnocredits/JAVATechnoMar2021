package krati_Shukla;

class Student1{
	
	String stuName;
	void studentName(String name){
		stuName = name;
	}
	
	void gainedMark(int marks){
		if (marks>90){
			System.out.println(stuName+" received grade A+");
		}else if (marks<90 && marks>80){
			System.out.println(stuName+" received grade A");
		}else if (marks<80 && marks>70){
			System.out.println(stuName+" received grade B+");
		}else if (marks<70 && marks>60){
			System.out.println(stuName+" received grade B");
		}else{
			System.out.println(stuName+" received grade C");
		}
	}
	
	public static void main(String[] a){
		Student1 student1 = new Student1();
		student1.studentName("Krati");
		student1.gainedMark(60);
	}
}