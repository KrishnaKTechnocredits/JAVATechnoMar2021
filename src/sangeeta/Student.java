package sangeeta;

class Student{
	int age=31;
	String name="Sangeeta";
	String surname="Bhandarkar";
	
	void showData(){
		System.out.println(age);
		System.out.println(name);
		System.out.println(surname);
	}
	
	public static void main(String[] a){
		Student s1 = new Student();
		s1.showData();
	}
}