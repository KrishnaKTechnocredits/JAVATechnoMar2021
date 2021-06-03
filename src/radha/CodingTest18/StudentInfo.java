/*
Program 2: Student -> return unique list of Student.
rno, first, lastname, address
Note : if rno and firstname is same then objects are duplicate.
 */
package radha.CodingTest18;

public class StudentInfo {
	
	private int rNo;
	private String fName;
	private String lName;
	private String address;
	
	public StudentInfo(int rNo, String fName, String lName, String address) {
		super();
		this.rNo = rNo;
		this.fName = fName;
		this.lName = lName;
		this.address = address;
	}
	
	@Override
	public int hashCode(){
		return this.rNo;
	}
	
	@Override
	public boolean equals(Object o){
		StudentInfo st = (StudentInfo) o;
		if(this == st) {
			return true;
		}else if(this.rNo==st.rNo && this.fName==st.fName) {
			return true;
		}else
			return false;
	}
	
	@Override
	public String toString() {
		return rNo+","+fName+" "+lName+","+address+"\n";
	}
}