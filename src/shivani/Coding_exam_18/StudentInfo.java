package shivani.Coding_exam_18;

public class StudentInfo implements Comparable<StudentInfo> {
	
	int rollNo;
	String Name;
	String className;
	
	
public StudentInfo(int rollNo, String name,String className) {
	super();
	this.rollNo =rollNo;
	this.Name = name;
	this.className= className;
	
}
@Override
public int compareTo(StudentInfo s1) {
	
	if (this.rollNo - s1.rollNo > 0) {
		return 1;
	}else if (this.rollNo - s1.rollNo < 0) {
		return -1;
	}else {
		return 0;
	}
}
@Override
public String toString() {
	return "Student [Roll Number=" + rollNo + ",  name=" + Name + ",  classname= " + className+"\n";
}
}

