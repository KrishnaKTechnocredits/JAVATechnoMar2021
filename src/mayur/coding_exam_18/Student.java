package mayur.coding_exam_18;

public class Student implements Comparable<Student> {
		int rollNo;
		String fName;
		String lName, address;
		Student(int rollNo,String fName,String lName,String address ){
			this.rollNo=rollNo;
			this.fName=fName;
			this.lName=lName;
			this.address=address;
		}

		
		public int compareTo(Student e) {
			return this.rollNo-e.rollNo;
		}

		
		public String toString() {
			return ("RollNo: "+rollNo+" FirstName: "+fName+ " LastName: "+lName+" Addresss: "+address);
		}
	}

