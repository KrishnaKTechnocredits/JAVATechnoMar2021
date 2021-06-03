package monika.Practise1.Revision2;

public class Student {
	private int rno;
	private String s;
	/*
	 * public Student(int i){ this.rno = i; }
	 * 
	 * public Student(String s){ this.s = s; }
	 */
	public String setName(String setName) {
		return this.s = setName;
	}

	@Override
	public String toString() {
		return this.s;
	}

	// For integer value logic
	public int setNum(int setNum) {
		return this.rno = setNum;
	}
	
/*	public String toString() {
		return String.valueOf(this.rno);
	}*/

}
