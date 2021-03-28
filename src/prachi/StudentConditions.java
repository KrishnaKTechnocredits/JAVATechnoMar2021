package prachi;

//Assignment_4_Program_2
//2. Create a class named as Student, which have methods like below.
//a. studentName()
//b. gainedMark()
//Expectations:
//• If student gain mark above 90% display student name with grade A+
//• If student gain marks between 80% to 90% display name with grade A
//• If student gain marks between 70% to 80% display name with grade B+
//• If student gain marks between 60% to 70% display name with grade B
//• If student gain marks below 60% display name with grade C
//Sample input : Student name - Maulik, mark - 75
//Sample output : Maulik received grade B+

class StudentConditions{
	String name;
	
	void studentName(String sName){
         name=sName;
	}
	
	void gainMark(int marks){
		if(marks > 90){
		    System.out.println(name+" recieved grade A+");
	    }
		else if(marks <= 90 && marks >80){
		    System.out.println(name+" recieved grade A");
        }
		else if(marks <= 80 && marks >70){
		    System.out.println(name+" wrecieved grade B+");
		}
	    else if(marks <=70 && marks >60){
			System.out.println(name+" recieved grade B");
		}
        else{
		    System.out.println(name+" recieved grade C");
		}
	}	
	public static void main(String[] args){
			StudentConditions student = new StudentConditions();
			student.studentName("Prachi");
			student.gainMark(65);
	}
} 