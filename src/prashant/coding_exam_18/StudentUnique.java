package prashant.coding_exam_18;

public class StudentUnique implements Comparable<StudentUnique> {
	private int stdrno;
	private String stdfirstname;
	private String stdlastname;
	private String stdaddress;

	public StudentUnique(int stdrno, String stdfirstname, String stdlastname, String stdaddress) {
		this.stdrno = stdrno;
		this.stdfirstname = stdfirstname;
		this.stdlastname = stdlastname;
		this.stdaddress = stdaddress;
	}

	@Override
	public String toString() {
		return "Student [stdrno=" + stdrno + ", stdfirstname=" + stdfirstname + ", stdlastname=" + stdlastname
				+ ", stdaddress=" + stdaddress + "]";
	}

	public int getStdrno() {
		return stdrno;
	}

	public void setStdrno(int stdrno) {
		this.stdrno = stdrno;
	}

	public String getStdfirstname() {
		return stdfirstname;
	}

	public void setStdfirstname(String stdfirstname) {
		this.stdfirstname = stdfirstname;
	}

	public String getStdlastname() {
		return stdlastname;
	}

	public void setStdlastname(String stdlastname) {
		this.stdlastname = stdlastname;
	}

	public String getStdaddress() {
		return stdaddress;
	}

	public void setStdaddress(String stdaddress) {
		this.stdaddress = stdaddress;
	}

	@Override
	public int hashCode() {
		return this.stdrno;
	}

	@Override
	public boolean equals(Object obj) {
		StudentUnique stdunique = (StudentUnique) obj;
		if (this.stdrno == stdunique.stdrno && this.stdfirstname == stdunique.stdfirstname
				&& this.stdlastname == stdunique.stdlastname)
			return true;
		return false;
	}

	@Override
	public int compareTo(StudentUnique std) {
		// TODO Auto-generated method stub
		return getStdrno() - std.getStdrno();
		// return 0;
	}

}
