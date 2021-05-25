package sandesh.OWN_Practice_Sandesh_1;

public class PolymorphismExample {

	void m1(String s){
		System.out.println("String variable");
	}
	
	void m1(float f){
		System.out.println("Float variable");
	} 

	

	public static void main(String[] args) {
		char ch = 'a';
		String s = "s";
		//int msg = 'a';
		new PolymorphismExample().m1(s);
		//m1(ch);
		
	}
}
