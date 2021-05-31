package monika.Practise1.Revision;

public class ExtraExamples_Overriding1 {
	private String x1 = "over1 x1";
			String x2 = "over1 x2";
	protected String x3 = "over1 x3";
	public String x5 = "10";
	public String x4 = "over1 x4";
	
	private void m1() {
		System.out.println("Over1 m1");
	}
	
	void m2() {
		System.out.println("Over1 m2");
	}
	protected void m3() {
		System.out.println("Over1 m3");
	}
	public void m4() {
		System.out.println("Over1 m4");
	}
	
	public void m5() {
		System.out.println("Over1 m5");
	}

	public int m7() {
		System.out.println("Ambiguity parent");
		return 7;
	}
}
