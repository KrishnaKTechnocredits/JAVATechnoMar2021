package rupali.codingexam.exam18;

public class Student1 {
	int rollno;
	String fname;
	String lname;
	String address;
	
	Student1(int rn,String fname,String lname,String address){
		this.rollno=rn;
		this.fname=fname;
		this.lname=lname;
		this.address=address;
	}
	
	public int hashcode() {
		return this.rollno;
	}
	
	public boolean equals(Object o) {
		Student1 s=(Student1)o;
		if(this==s || this.rollno==s.rollno && this.fname.equals(s.fname))
			return true;
		else
			return false;
	}
	
	public String toString() {
		return "Student rollno="+rollno+" Name="+fname+" Last name= "+lname+" Address="+address;
	}


}
