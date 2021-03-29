//Assignment 4

package rupali;
class Student{
		String studname;
		
		void studentname(String sname){
			studname=sname;
		}
		
		void gainedMarks(int marks){
			if(marks>90){
				System.out.println(studname+" received A+ grade");
			}
			else
				if(marks>80 && marks<=90){
				System.out.println(studname+" received A grade");
				}
				else
					if(marks>70 && marks<=80){
					System.out.println(studname+" received B+ grade");
					}
					else
						if(marks>60 && marks<=70){
							System.out.println(studname+" received B grade");
						}
						else
							System.out.println(studname+" received c grade");
		}
		
		public static void main(String[] args){
			Student student=new Student();
			student.studentname("Rupali");
			student.gainedMarks(78);
			student.studentname("Surabhi");
			student.gainedMarks(90);
		}
}
			