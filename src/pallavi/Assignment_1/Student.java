package pallavi.Assignment_1;

class Student{
  int age=23;
  String name="Pallavi";
   void ShowData(){
     System.out.println(age);
     System.out.println(name);
}

public static void main(String args[]){
	
	Student s1=new Student();
	s1.ShowData();
}
}