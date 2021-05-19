package monika.Practise1;

 public class Manager {
	private int x;
	public Manager(int i){
		super();
		this.x = i;
		System.out.println("Value: "+x+" Parent class consructor");
	}
	
	protected void m1() {
		System.out.println("M1");
		
	}

}
