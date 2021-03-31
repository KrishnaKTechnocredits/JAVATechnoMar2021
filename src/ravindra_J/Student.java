/*	Write a Java program to print age and name
 */
package ravindra_J;	

class Student{
	int age =31;
	String name = "Techno";
	void showData(){
		System.out.println(age);
		System.out.println(name);
	}
	public static void main(String []args){
		Student s1 = new Student(); // reserve memory in RAM for all the class object
		s1.showData(); //31 Techno
		System.out.println(s1); //Student@1db9742   memory address of object  
	}
}

