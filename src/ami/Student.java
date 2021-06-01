package ami;

class Student{
	int age=19;
	String name="xyz xyz";
	
	void display(){
		System.out.println(age + name);
		System.out.println(name);
	}
	
	public static void main(String[] a)
	{
		Student s1= new Student();
		s1.display();
		System.out.println(s1);
	}

}   