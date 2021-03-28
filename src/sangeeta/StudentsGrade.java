package sangeeta;
class StudentsGrade{
	String studentName;
	
	void studentName(String name){
		studentName = name;
	}
	
	void gainedMark(int mark){
		if(mark >= 90){
			System.out.println(studentName+" received A+ Grade");
		}else if(mark < 90 && mark >= 80){
			System.out.println(studentName+" received A Grade");
		}else if(mark < 80 && mark >= 70){
			System.out.println(studentName+" received B+ Grade");
		}else if(mark < 80 && mark >= 60){
			System.out.println(studentName+" received B Grade");
		}else{
			System.out.println(studentName+" received C Grade");
		}
	}
	
	public static void main(String[] a){
		StudentsGrade studentsGrade = new StudentsGrade();
		studentsGrade.studentName("Maulik");
		studentsGrade.gainedMark(90);
		studentsGrade.studentName("Ram");
		studentsGrade.gainedMark(80);
		studentsGrade.studentName("Shyam");
		studentsGrade.gainedMark(70);
	}
}