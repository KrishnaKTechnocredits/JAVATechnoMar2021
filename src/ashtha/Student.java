package ashtha;

public class Student{
	int age=19;
	String name = "Astha Prakash";
	char rating = '@';
	
	void showData(){
	System.out.print(age);
	System.out.print(name);
	System.out.print(rating);
}
	   
	public static void main (String[] a) {
		Student s1 = new Student ();
		s1.showData();
	}
}