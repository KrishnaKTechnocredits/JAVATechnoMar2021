package gaurav;

//Assignment 4

class StudentMark{
	String stuName;
	
	void stuName(String name ){
		stuName=name;
	}
	void gainedMark(double mark){
		if(mark > 90){
			System.out.println(stuName + "is received garde A+");
		}
		else if(mark > 80&& mark <= 90){
			System.out.println(stuName + "is received garde +A");
		}
		else if(mark > 70&& mark <= 80){
			System.out.println(stuName + "is received garde B+");
		}
		else if(mark > 60&& mark <=70){
			System.out.println(stuName + "is received garde B");
		}
		else{
			System.out.println(stuName + "is received garde C");
		}	
	}
	public static void main(String[]args){
		StudentMark studentMark1 = new StudentMark();
		studentMark1.stuName("Gauarv Bhagwat");
		studentMark1.gainedMark(92);
		studentMark1.stuName("Nikhil Kulkarni");
		studentMark1.gainedMark(75);
	}	
	
}