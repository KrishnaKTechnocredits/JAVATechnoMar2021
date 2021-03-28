package aashay;

public class TestFirstGitPush {
	String name;
	
	void name(String nme) {
		name =nme;
	}
	void display() {
		System.out.println("Name is:"+name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestFirstGitPush testfirstgitpush = new TestFirstGitPush();
		testfirstgitpush.name("Aashay");
		testfirstgitpush.display();
	}

}
