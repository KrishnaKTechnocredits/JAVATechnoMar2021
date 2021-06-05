package monika.Practise1.Revision2;

import java.util.HashMap;

import monika.Practise1.Revision.ExtraExamples_Overriding1;

public class Child_Examples_Overriding extends ExtraExamples_Overriding1{

	private String x1 = "over2 x1";
	String x2 = "over2 x2";
	protected String x3 = "over2 x3";
	public int x5 = 100;
	public String x4 = "over2 x4";

	private void m1() {
		System.out.println("Over2 m1");
	}
	void m2() {
		System.out.println("Over2 m2");
	}
	
	protected void m3() {
		System.out.println("Over2 m3");
	}
	@Override
	public void m4() {
		System.out.println("Over2 m4");
	}
	
	 void m5(int x) {
		System.out.println("child - m5");
	}
	void m6() {
		System.out.println("Over2 m6");
	}
	
	static public void m11() {
	System.out.println("start of m11");
	ExtraExamples_Overriding1 p = new ExtraExamples_Overriding1(); //parent class object created
//Child_Examples_Overriding c1 = (Child_Examples_Overriding)p; //parent class var assign to child class var
		
		//Child_Examples_Overriding c2 = p; //CE -> Parent class var assign to child class var
		Child_Examples_Overriding c3 = (Child_Examples_Overriding)new ExtraExamples_Overriding1(); //- NO CE but RE
		System.out.println("End of m11");
	
	}
	/*•	We need to explicitly cast this to Subclass. 
	o	Child c = new Child ();
	o	Parent p = c;
	o	Child c1 = (Child)p;*/ 
	
	
	
	
	

	public static void main(String[] args) {
		m11();
		
		Child_Examples_Overriding t = new Child_Examples_Overriding();
		System.out.println(t.x5);
		
		
		
		HashMap<Integer,Integer> s1 = new HashMap<Integer,Integer>();
		Integer temp = s1.put(1, 9899);
		System.out.println("**"+temp);
		s1.put(2,12334556);
		s1.put(3,23424252);
		s1.put(1, 156);
		System.out.println(s1);
		System.out.println(s1.size());
	
	   HashMap<String, String> s2 = new HashMap<String,String>();
	   s2.put("", "Monika");
	   s2.put("1", "");
	   s2.put(" "," ");
	   s2.put("","");
	   s2.put(null, null);
	   s2.put("null", "null");
	   s2.put(null, "Gagan");
	   System.out.println(s2);
	   
	   //HashMap<String, Integer> 
	   
	   
	
	}
}
