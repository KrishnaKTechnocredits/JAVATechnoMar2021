package monika.Practise1;

 public class Manager {
	private int x;
	public Manager(){
		this.x = 1;
		System.out.println("Hi");
	}
	public Manager(int i){
		//super();
		this.x = i;
		System.out.println(this.x);
		//System.out.println("Value: "+x+" Parent class consructor");
	}
	
	public void m1() {
		System.out.println("M1");
		
	}

}
