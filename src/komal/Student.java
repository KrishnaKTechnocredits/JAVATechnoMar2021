package komal;

class Student{
	int age=20;
	void showData(){
		System.out.println(age);
	}
	
	public static void main(String[] args){
		Student s1 = new Student();
		s1.showData();
	}
}
