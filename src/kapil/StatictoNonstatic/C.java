package kapil.StatictoNonstatic;

public class C {
	
	void m4() {
		C c = new C();
		c.m5();
	
	}
   
	void m5(){
		D d = new D();
		d.m6();
		
	}
}
