package ashish_Vyas.Assihnment_11;

public class StaticExampleC {
	void m4() {
		System.out.println("Called m4 Method");
		m5();
	}
	
	void m5() {
		System.out.println("Called m5 Method");
		StaticExampleD.m6();
	}

}
