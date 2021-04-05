package ashtha;

public class StudentData{
	int age=19;
	String name = "Astha Prakash";
	char rating = '@';
	
	void showData(){
	System.out.print(age);
	System.out.print(name);
	System.out.print(rating);
}
	   
	public static void main (String[] a) {
		StudentData s1 = new StudentData ();
		s1.showData();
	}
}