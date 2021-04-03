package prachi.Sample_Programs;

public class Display {
	
	void displayName(String name) {
		System.out.println("User Name is "+name);
		
	}
	
	public static void main(String[] args){
		Display nname = new Display();
		nname.displayName("Prachi");
	}

}
