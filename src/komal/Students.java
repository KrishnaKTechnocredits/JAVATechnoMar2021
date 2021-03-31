package komal;

class Students{
	String sName;

	void studentName(String name){
		sName = name;	
	}
	void gainedMark(double percentage){
		if(percentage > 90){
			System.out.println( sName + " Received grade A+" );
		}else if(percentage <=90 && percentage > 80){
			System.out.println( sName + " Received grade A" );
		}else if(percentage <=80 && percentage > 70){
			System.out.println( sName + " Received grade B+" );
		}else if(percentage <=70 && percentage > 60){
			System.out.println( sName + " Received grade B" );
		}else if(percentage < 60){
			System.out.println( sName + " Received grade c" );
		}
	}
	public static void main(String[] a){
		Students students = new Students();
			students.studentName("komal");
			students.gainedMark(86);
			students.studentName("Aarti");
			students.gainedMark(95);
			students.studentName("Ari");
			students.gainedMark(66);
	}
}	
		