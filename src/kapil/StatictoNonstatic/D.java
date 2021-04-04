package kapil.StatictoNonstatic;

public class D {
	
	static  void m6() {
		 D.m7();
	}
    static void m7() {
	System.out.println("m7");
}
}
