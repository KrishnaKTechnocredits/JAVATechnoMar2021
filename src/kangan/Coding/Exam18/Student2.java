package kangan.Coding.Exam18;

public class Student2{

	int roll;
	String fname;
	String lname;
	String city;
	
	public Student2(int roll, String fname, String lname, String city) {
		super();
		this.roll = roll;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
	}

	@Override
	public int hashCode() {

		return this.roll;
	}
	
	@Override
	// Compared only employee ID 
	/*public boolean equals(Object obj) {
		Student2 stu  = (Student2	)obj;
		if(this.roll==stu.roll)
			return true;
		return false;
	}*/

	// Compared only employee ID and empName
	public boolean equals(Object obj) {
		Student2 stu  = (Student2)obj;
		if(this.roll==stu.roll && this.fname.equals(stu.fname))
			return true;
		return false;
	}
	

	@Override
	public String toString() {
		return "Student2 [roll=" + roll + ", fname=" + fname + ", lname=" + lname + ", city=" + city + "]";
	}
	}


