package bhushan;
class Student{
  int age=19;
  
  void showData() {
   System.out.println(age);
   System.out.println("Bhushan");
  }
  public static void main(String[] args) {
    Student s1= new Student();
  s1.showData();
  }  
}