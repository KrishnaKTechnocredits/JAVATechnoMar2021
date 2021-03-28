package ashtha;

class Student1{
   int age=19;
   String name = "Astha Prakash";
   char rating = '@';
   void showData(){
       System.out.print(age);
	   System.out.print(name);
	   System.out.print(rating);
   }
   
   public static void main (String[] a) {
	Student1 s1 = new Student1 ();
	s1.showData();
   }
 }