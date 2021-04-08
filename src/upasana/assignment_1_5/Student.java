package upasana;

class Student{
	String sName;
	int sMark;
	
	void studentName(String name,int mark){
		sName = name;
		sMark = mark;
		System.out.println("Student name - "+sName +"," +"mark" +"-"+sMark);
	}
	
	void gainedMark(int mark){
			sMark = mark;
			if(sMark >= 90){
				System.out.println(sName+" " +"received"+" " +"grade A+");
			}
			else if(sMark >= 80 && sMark < 90){
					System.out.println(sName+" " +"received"+" " +"grade A");
			}
			else if(sMark >= 70 && sMark < 80){
					System.out.println(sName +" "+"received" +" "+"grade B+");
			}
			else if(sMark >= 60 && sMark < 70){
					System.out.println(sName +" "+"received"+" " +"grade B");
			}
			else if(sMark < 60){
					System.out.println(sName +" " +"received" +" " +"grade C");
			}
	}
	
	public static void main(String[] args){
			Student student = new Student();
			student.studentName("Maulik",70);
			student.gainedMark(70);
	}
}