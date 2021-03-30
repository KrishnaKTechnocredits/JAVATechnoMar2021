package gaurav;

// Assignment 1

class Student{
  int age=19;
  String name="Techno";
  
  void showData(){
   System.out.println(age);
   System.out.println(name);
  }
   public static void main(String[]args){
  
	   Student s1 = new Student();
	   s1.showData();
	   
   }
}