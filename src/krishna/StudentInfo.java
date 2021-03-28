package krishna;
class StudentInfo{
	String name = "krishna";
	String middle_name= "kumar";
	String surname = "Sawner";
	String birthdate = "10th Aug 1998";
	String address = "G-809, Heaven Apartment, Baner, Pune.";
	int rollNumber = 25;
		
		void studentname(){
			System.out.println(name);
			System.out.println(middle_name);
			System.out.println(surname);
		}
		void  studentOtherDetails(){
			System.out.println(birthdate);
			System.out.println(address);
			System.out.println(rollNumber);
		}
		public static void main(String[]args){
			StudentInfo studentInfo = new StudentInfo();
			studentInfo.studentname();
			studentInfo.studentOtherDetails();
		}
}