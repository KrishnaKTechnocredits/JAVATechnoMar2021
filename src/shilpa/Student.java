package shilpa;

class Student{
	int age = 19;
	String name = "Shilpa";
	void showData(){
		System.out.print(age );
		System.out.print(name);
	}
	public static void main(String[] args){
	Student s1 = new Student();
	s1.showData();
	}
 }
