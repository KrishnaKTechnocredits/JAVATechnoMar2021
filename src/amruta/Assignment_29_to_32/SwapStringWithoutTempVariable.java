package amruta.Assignment_29_to_32;

public class SwapStringWithoutTempVariable {

	void swapString(String name, String name1) {

			name = name + name1; 
			name1 = name.substring(0, name.length()- name1.length());
			name = name.substring(name1.length());
			
			System.out.println("name :"+name);
			System.out.println("name1 :"+name1);
		
	}

	public static void main(String[] args) {
		SwapStringWithoutTempVariable swap = new SwapStringWithoutTempVariable();
		
		swap.swapString("Amruta", "Kharat");
	}
}
