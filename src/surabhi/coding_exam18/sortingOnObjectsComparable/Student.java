package surabhi.coding_exam18.sortingOnObjectsComparable;

public class Student implements Comparable{
	int rNo;
	String fName,lName,address;
	public Student(int rNo,String fName,String lName, String address) {
		this.rNo=rNo;
		this.fName=fName;
		this.lName=lName;
		this.address=address;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Student s=(Student)o;
		return this.rNo-s.rNo;
	}
	@Override 
	public String toString() {
		return "["+this.rNo+" "+this.fName+" "+this.lName+" "+this.address+"]";
	}

}
