package siddhant;

class StuMarks{
		String name;
		void studentname(String a){
				 name = a;
				System.out.println("Student name is - "+a);
		}
		void gainedmarks(int b){
				if(b>=90){
					System.out.println(name+"  Recieved grade A+");
				}
				else if(b>=80 && b<90){
					System.out.println(name+ " Recieved grade A");
				}
				else if(b>=70 && b<80){
					System.out.println(name+ " Recieved grade B+");
				}
				else if(b>=60 && b<70){
					System.out.println(name+ " Recieved grade B");
				}
				else if(b<60){
					System.out.println(name+ " Recieved grade C");
				}
		}
		public static void main(String[]a){
			StuMarks sm = new StuMarks();
			sm.studentname("Siddhant");
			sm.gainedmarks(90);
		}
	}		
	
		