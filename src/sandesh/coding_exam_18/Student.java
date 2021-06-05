package sandesh.coding_exam_18;
//SortStudent creates object of this class

public class Student implements Comparable<Student>{
	
	int rNo;
	String firstName;
	String lastName;
	String address;
	
	Student(int rNo, String firstName, String lastName, String address) {
		this.rNo = rNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	
	@Override
	public int compareTo(Student s1) {
		if (this.rNo > s1.rNo) {
			return 1;
		}
		else if (this.rNo < s1.rNo) {
			return -1;
		}
		else {
			return 0;
		}
	}
	
	public String toString() {
		return "Roll Number " + this.rNo + " First Name " + firstName + " Last Name " + lastName + " Address " + address + " : --- : ";
	}
	
}