package monika.Practise1.Revision2;

import monika.FirstExample;
import monika.Practise1.Revision.FourthInterface;
import monika.Practise1.Revision.ThirdInterface;

public abstract interface FirstInterface {
	static int a =10;
	
	    default  void sum () {
	    	System.out.println("Interface sum method");
	}
	    
	    static void sub() {
	    	System.out.println("Interface sub method");
	    }
	    abstract void mul();
	    
}


