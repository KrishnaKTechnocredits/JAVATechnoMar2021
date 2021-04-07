package ashish_Vyas.Assihnment_11;

public class StaticExampleB {
	void m2() {
		System.out.println("Called m2 Method");
		StaticExampleB.m3();
	}
	
	static void m3() {
		System.out.println("Called static m3 Method");
		StaticExampleC staticExampleC =new StaticExampleC();
		staticExampleC.m4();			
	}
	

}
