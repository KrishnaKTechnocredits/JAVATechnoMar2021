package kapil;

class StudentMarksheet{

     void studentName(String name){
	      System.out.println("Student Name is "+name);
		  }
		  
	 void gainedMark(int mark){
          if(mark >= 90){
          System.out.println("Rohit received grade A+");
          }
          else if(mark <= 90 && mark > 80){		  
		  System.out.println("Rohit received grade A");
		  }
		  else if(mark <= 80 && mark > 70){
		  System.out.println("Rohit received grade B+");
		  }
		  
		  else if(mark <= 70 && mark > 60){
		  System.out.println("Rohit received grade B");
		  }
		  else{ 
		  System.out.println("Rohit received grade C");
		  }
	 }	  
	 public static void main(String[] args){
          StudentMarksheet studentMarksheet = new StudentMarksheet();
		  studentMarksheet.studentName("Rohit");
          studentMarksheet.gainedMark(75);		
          }
}		  