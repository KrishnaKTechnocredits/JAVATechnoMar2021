package amruta;

public class TestDisplay {
	String studName;
	int rollno;
	
		void studinfo(String name, int rollnum) {
			studName = name;
			rollno = rollnum;
		}
		void display() {
			System.out.println("Student Name is : "+studName+" and Roll No is : "+rollno);
		}
		public static void main(String[] args) {
			TestDisplay testDisplay = new TestDisplay();
			testDisplay.studinfo("Amruta",20);
			testDisplay.display();
		}
}
