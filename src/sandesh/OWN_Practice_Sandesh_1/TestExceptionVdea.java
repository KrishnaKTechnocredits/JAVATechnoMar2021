package sandesh.OWN_Practice_Sandesh_1;

public class TestExceptionVdea {
	
	public static void main(String[] args) {
		int i;
		try {
			i = calculate();
			System.out.println(i);
			System.out.println(Integer.parseInt("four"));
		} //catch (Exception e) {
			//System.out.println("Error occured");
		//}
		finally {
			
		}
	}
	
	static int calculate() {
		return (7/2);
		
	}
}
