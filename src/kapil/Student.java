package kapil;

class Student{		
    int age=19;
	void showData(){
	    System.out.println(age);
	}
	
	public static void main(String[] a){ 
	    Student s1 = new Student();
		s1.showData();
	}
}