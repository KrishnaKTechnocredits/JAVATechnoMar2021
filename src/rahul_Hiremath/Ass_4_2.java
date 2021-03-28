package rahul_hiremath;

class Ass_4_2
{
	String sName;
	void studentName(String name){
		sName = name;
	}
	void gainedMark(int marks){
		if (marks > 90)
			System.out.println(sName + " reveived grade A+");
		else if (marks > 80 && marks <= 90)
			System.out.println(sName + " reveived grade A");
		else if (marks > 70 && marks <= 80)
			System.out.println(sName + " reveived grade B+");
		else if (marks > 60 && marks <+70)
			System.out.println(sName + " reveived grade B");
		else if (marks <=60)
			System.out.println(sName + " reveived grade C");
	}
	public static void main (String[] args){
		Ass_4_2 student = new Ass_4_2();
		student.studentName("Rahul");
		student.gainedMark(60);
	}
}