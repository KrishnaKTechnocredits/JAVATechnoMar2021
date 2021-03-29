package anubhav;

class StudentInfo 
	{
		String name= "Shikha";
		String middleName= "Amit";
		String surname= "Patel";
		String birthdate= "10th Aug 1998";
		String address= "G-809, Heaven Apartment, Baner, Pune.";
		int rollNo= 34;
	
		void studentName()
		{
			System.out.println(name);
			System.out.println(middleName);
			System.out.println(surname);
		}
	
		void studentOtherDetails()
		{
			System.out.println(birthdate);
			System.out.println(address);
			System.out.println(rollNo);
		}
		
		public static void main (String[] args)
		{
			StudentInfo studentInfo = new StudentInfo();
			studentInfo.studentName();
			studentInfo.studentOtherDetails();
		}
	}	