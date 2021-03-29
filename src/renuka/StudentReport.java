/*Assignment-4 :*/

package renuka;

class StudentReport{
     String name;
	 
	 void studentName(String sname){
	     name = sname;
	 }
	 
	 
	 void gainedMarks(int marks){
	     if(marks > 90){
		    System.out.println(name+" Recieved A+ Grade");	
		 }
		 else if(marks > 80 && marks <= 90){
		    System.out.println(name+" Recieved A Grade");
		      }
		      else if(marks > 70 && marks <= 80){
		         System.out.println(name+" Recieved B+ Grade");
		           }
				   else if(marks > 70 && marks <= 80){
		                 System.out.println(name+" Recieved B Grade");
		                }
				        else{
		                     System.out.println(name+" Recieved C Grade");
		                    }	
	 }
	 
     public static void main(String[] args){
	 StudentReport student=new StudentReport();
	 student.studentName("Renuka");
	 student.gainedMarks(94);
	 student.studentName("Sakshi");
	 student.gainedMarks(85);
	 student.studentName("John");
	 student.gainedMarks(55);
	 }
}