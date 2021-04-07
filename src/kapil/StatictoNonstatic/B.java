package kapil.StatictoNonstatic;

public class B {
	
	void  m2() {
   	   B.m3();
	}
    static void m3(){
	   C c = new C();
	   c.m4();

}
}
