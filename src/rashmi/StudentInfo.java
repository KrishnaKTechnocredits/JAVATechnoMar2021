package rashmi;
public class StudentInfo{

String name = "Tina"; 
String middleName = "Raj";
String surname = "Sharma";
String birthdate = "12th Feb 1996";


String address = "S-405, Sunrise Apartment, Hinewadi, Pune.";
int rollNumber = 76;

void studentName(){
         System.out.println(name);
		 System.out.println(middleName);
		 System.out.println(surname);
		 
	}
	
void studentOtherDetails(){
        System.out.println(birthdate);
		System.out.println(address);
		System.out.println(rollNumber);
	 }
   
public static void main(String[] args){
	    StudentInfo studentinfo = new StudentInfo();
		studentinfo.studentName();
		studentinfo.studentOtherDetails();
 }  

}
