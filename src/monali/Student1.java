package monali;

class Student1{
	String stdname;
    
    void studentName(String name){
         stdname = name;
	}		 
	
	void gainedMarks(int marks){
		if(marks >= 90){
		System.out.println(stdname +" received A+ grade ");
	    }else if(marks <=90 && marks >80){
		System.out.println(stdname +" received A garde ");
		}else if(marks <=80 && marks >70){
		System.out.println(stdname +" received B+ grade ");
		}else if(marks <=70 && marks >60){
		System.out.println(stdname +" received B grade ");
		}else if(marks <60){
		System.out.println(stdname +" received C garde");
		}
	}
	
	public static void main(String[] a){
		Student1 student1 = new Student1();
		student1.studentName("saurav");
		student1.gainedMarks(75);
	}
}
