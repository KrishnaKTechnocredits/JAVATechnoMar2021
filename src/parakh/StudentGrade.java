package parakh;

public class StudentGrade{
      String studentName;
	  
	  void studentName(String name){
	       studentName = name;
	  }
	  
	  void gainedMark(int marks){
	       if(marks>90){
		        System.out.println(studentName +" received grade A+");
		   }
		   else if(marks>80 && marks<=90){
		        System.out.println(studentName +" received grade A");
		   }
		   else if(marks>70 && marks<=80){
		        System.out.println(studentName +" received grade B+");
		   }
		   else if(marks>60 && marks<=70){
		        System.out.println(studentName +" received grade B");
		   }
		   else{
		       System.out.println(studentName +" received grade C");
		   }
      }

      public static void main(String args[]){
           StudentGrade studentGrade = new StudentGrade();
           studentGrade.studentName("Maulik");
           studentGrade.gainedMark(75);
      }
}	  
			