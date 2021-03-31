//2. Create a class named as Student, which have methods like below.
//a. studentName()
//b. gainedMark()

package shilpa;

class Student1{
	String name;
	void studentName(String stdName){
	name = stdName;
	}
	void gainedMark(int marks){
		if(marks>90){
			System.out.println(name + " Received Grade A+");
		}else if(marks>80 && marks<=90){
			System.out.println(name + " Received Grade A");
		}else if(marks>70 && marks<=80){
			System.out.println(name + " Received Grade B+");
		}else if(marks>60 && marks<=70){
			System.out.println(name + " Received Grade B");
		}else{
			System.out.println(name + " Received Grade C");
		}
	}
	
	public static void main(String[] a){
			Student1 student1 = new Student1();
			student1.studentName("Shilpa");
			student1.gainedMark(95);
			student1.studentName("Ivani");
			student1.gainedMark(90);
			student1.studentName("Sneha");
			student1.gainedMark(80);
			student1.studentName("Priya");
			student1.gainedMark(0);
			student1.studentName("Sonali");
			student1.gainedMark(55);
	}
}
			
			
			
	