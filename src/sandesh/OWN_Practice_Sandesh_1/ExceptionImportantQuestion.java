package sandesh.OWN_Practice_Sandesh_1;

public class ExceptionImportantQuestion {

	private int m1(int x) {
		try {
			int ans = 10/x;
			return ans;
		} //catch (ArithmeticException ae) {
			//return 100;
		//} 
		catch (NullPointerException ne) {
			return 200;
		} catch (StringIndexOutOfBoundsException se) {
			return 300;
		} finally {
			//return 100;
			//System.out.println("In finally ");
			//return 400; //if we comment out this return, then only top values will be returned
		}
		//return 500; // we get CE as this statement never gets executed coz in the worst case finally always gets executed.
	}
	
	public static void main(String[] args) {
		//int[] arr = {33,44,55};
		//System.out.println(new ExceptionImportantQuestion().m1(10));
		System.out.println(new ExceptionImportantQuestion().m1(0));
		//System.out.println(new ExceptionImportantQuestion().m1(arr[3]));
	}
}
