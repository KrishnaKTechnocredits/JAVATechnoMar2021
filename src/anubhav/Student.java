package anubhav;

class Student{
	int age = 103;
	String name= "Anubhav";
	void display(){
		System.out.println(age);
		System.out.println(name);
		System.out.println(age+name);
		}
		public static void main(String[] a){
			Student s1= new Student ();
			s1.display();
			System.out.println(s1); // Memory Address
		} 
} 		
