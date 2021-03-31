package nikita;

public class Student {
	String name;
	int marks;
 void studentName(String nme) 
 {
	 name=nme;
	 
 }
 
 void gainedMarks(int mk)
 {
	 marks=mk;
	 if(marks>90)
		 System.out.println(name+" "+"has scored A+");
	 else if(marks>80 && marks<90)
		 System.out.println(name+" "+"has scored A");
	 else if(marks>70 && marks<80)
		 System.out.println(name+" "+"has scored B+");
	 else if(marks>60 && marks<70)
		 System.out.println(name+" "+"has scored B");
	 else
		 System.out.println(name+" "+"has scored C");
 }
 public static void main(String args[])
 {
	 Student st= new Student();
	 st.studentName("Nikita");
	 st.gainedMarks(-75);
 }
}
 
