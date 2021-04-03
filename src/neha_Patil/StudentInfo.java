package neha_Patil;

public class StudentInfo {
	
	      String name ="Neha";
		  String midname = "narendra";
		  String surname = "patil";
		  String birthdate = "23rd march 1992";
		   String address ="Mantra MOments";
		  int rollNumber = 31;
		 
	void studentName() {
			System.out.println(name);
			System.out.println(midname);
			System.out.println(surname);
		}

		void studentOtherDetails() {
			System.out.println(birthdate);
			System.out.println(address);
			System.out.println(rollNumber);
		}

		public static void main(String[] args) {
			StudentInfo studentInfo = new StudentInfo();
			studentInfo.studentName();
			studentInfo.studentOtherDetails();

		}
	}

