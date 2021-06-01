package technocredits.exception;

public class Example13 {

	int m1(int x){
		int[] arr = {10,20};
		System.out.println(arr[0]);
		try{
			System.out.println("Techno");
			int ans = 10/x;
			//return ans;
		}catch(ArithmeticException ae){
			return 100;
		}catch(NullPointerException ne){
			System.exit(0);
			return 200;
		}catch(StringIndexOutOfBoundsException se){
			return 300;
		}finally{
			//return 400;
		}
		return 500;
	}
	
	public static void main(String[] args) {
		int ans = new Example13().m1(0);
		System.out.println(ans);
	}
	
}
