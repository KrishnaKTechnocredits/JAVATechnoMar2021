package monika.Practise1.Revision;

public class Examples_Overriding2 extends ExtraExamples_Overriding1 {
	private String x1 = "over2 x1";
	String x2 = "over2 x2";
	protected String x3 = "over2 x3";
	public String x4 = "over2 x4";

	private void m1() {
		System.out.println("Over2 m1");
	}
	@Override
	void m2() {
		System.out.println("Over2 m2");
	}
	@Override
	protected void m3() {
		System.out.println("Over2 m3");
	}
	@Override
	public void m4() {
		System.out.println("Over2 m4");
	}
	void m6() {
		System.out.println("Over2 m6");
	}

}
