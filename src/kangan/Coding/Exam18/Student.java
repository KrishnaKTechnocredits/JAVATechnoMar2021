package kangan.Coding.Exam18;

public class Student implements Comparable<Student> {

	int roll;
	String fname;
	String lname;
	String city;
	double salary;
	
	public Student(int roll, String fname, String lname, String city,double salary) {
		super();
		this.roll = roll;
		this.fname = fname;
		this.lname = lname;
		this.city = city;
		this.salary = salary;
	}

	public int getRoll() {
		return roll;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public String getCity() {
		return city;
	}
	public double getSalary() {
		return salary;
	}

	
	//Sorting based on roll number
	/*
	 * @Override public int compareTo(Student s1) { if((this.roll - s1.roll)>0)
	 * return 1; else if ((this.roll - s1.roll)<0) return -1; else return 0;
	 * 
	 *
	 * //return (this.roll - s1.roll); }
	 */

	//Sorting based on firstname, same will be for last name and city
	//@Override
	//public int compareTo(Student stu) { 
	//	return (this.fname.compareTo(stu.fname));
	//}

	//Sorting based on salary
	/*
	 * @Override public int compareTo(Student stu) { return
	 * (int)(this.salary-stu.salary);
	 * 
	 * }
	 */

	//Sorting based on roll number
	public int compareTo(Student o1) {
		return this.getRoll() - o1.getRoll();
	}
	
	@Override
	public String toString() {
		return "Student1 [roll=" + roll + ", fname=" + fname + ", lname=" + lname + ", city=" + city + ",salary=" + salary + "]";
	}

}
