package krishna;
class Student1{
	String studentName;
	
	void studentName(String name){
		studentName=name;
	}
	
	void gainedMark(int percent){
		if(percent>=90){
			System.out.println(studentName+" Grade A+");
		}else if(percent<90 && percent>=80){
			System.out.println(studentName+" Grade A");
		}else if(percent<80 && percent>=70){
			System.out.println(studentName+" Grade B+");
		}else if(percent<70 && percent>=60){
			System.out.println(studentName+" Grade B");
		}else{
			System.out.println(studentName+" Grade c");
		}
			
	}
	
	public static void main(String[] args){
		Student1 student1 = new Student1();
		student1.studentName("krishna");
		student1.gainedMark(97);
	}
}