package technocredits.collectionDemo.comparableDemo;

public class Student implements Comparable<Student> {

	private int rno;
	private String fname;
	private String lname;
	char grade;
	
	public Student(int rno, String fname, String lname, char grade) {
		super();
		this.rno = rno;
		this.fname = fname;
		this.lname = lname;
		this.grade = grade;
	}

	public int getRno() {
		return rno;
	}

	public String getFname() {
		return fname;
	}

	public String getLname() {
		return lname;
	}

	public char getGrade() {
		return grade;
	}

	@Override
	public int compareTo(Student o) {
		return this.getGrade() - o.getGrade();
	}
	
	
	
}
