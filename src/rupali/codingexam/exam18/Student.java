package rupali.codingexam.exam18;

public class Student implements Comparable {
	int rollno;
	String fname;
	String lname;
	String address;
	
	Student(int rn,String fname,String lname,String address){
		this.rollno=rn;
		this.fname=fname;
		this.lname=lname;
		this.address=address;
	}
	
	public String toString() {
		return "Student rollno="+rollno+" Name="+fname+" Last name= "+lname+" Address="+address;
	}

	public int compareTo(Object o) {
		Student s=(Student)o;
		return this.rollno-s.rollno;
	}
}
