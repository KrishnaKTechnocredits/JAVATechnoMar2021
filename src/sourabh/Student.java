package sourabh;

class Student{
	int age= 20;
	String name= "Sourabh";
	void showData()
	{
	System.out.println(age);
	System.out.println(name);
	}
	
	public static void main(String[] args)
	{
		Student S1= new Student();
		S1.showData();
	}

}