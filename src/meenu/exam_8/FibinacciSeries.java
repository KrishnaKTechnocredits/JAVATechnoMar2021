package meenu.exam_8;

/*Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13 
*/

public class FibinacciSeries {

	void getFibinacciNum(){
		int x = 0;
		int y = 1;
		int c = 0;
		System.out.println(x);
		System.out.println(y);
		for(int num = 2;num<8;num++) {
			c = x+y;
			System.out.println(c);
			x=y;
			y=c;		
		}		
	}
	public static void main(String[] args) {
		FibinacciSeries fibinacciSeries = new FibinacciSeries();
		fibinacciSeries.getFibinacciNum();
	}
}
