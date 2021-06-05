package mayur.coding_exam_18;

public class StudentDetails {
		int rollNo;
		String firstName,surName,address;

		StudentDetails(int no,String firstname, String lastname,String add){
			this.rollNo=no;
			this.firstName=firstname;
			this.surName= lastname;
			this.address=add;
		}

		
		public boolean equals(Object obj){
			StudentDetails s1 = (StudentDetails) obj;
			if(this.rollNo==s1.rollNo && this.firstName==s1.firstName)
			return true;
			return false;
		}
		 
		public int hashCode() {
			return firstName.hashCode();
		}
	}

