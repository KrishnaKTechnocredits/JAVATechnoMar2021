package surabhi.coding_exam18.addUniqueObjectContent;

public class Student {
	int rNo;
	String fName, lName, address;
	public Student(int rNo, String fName,String lName, String address) {
		this.rNo=rNo;
		this.fName=fName;
		this.lName=lName;
		this.address=address;
	}
	
	@Override
	public int hashCode() {
			return this.rNo;
		}
	@Override
	public boolean equals(Object o) {
		Student s=(Student)o;
		if(this==s || (this.rNo==s.rNo && this.fName==s.fName)) {
			return true;
		}else 
			return false;
	}
	
	@Override
	public String toString() {
		return "["+rNo +" "+fName +" "+ lName+" "+address+"]";
	}

}
