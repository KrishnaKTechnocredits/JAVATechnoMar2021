package surabhi.coding_exam8;

/*Program 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13 */

public class FibonnaciSeries {
	
	int[] getFibbonacySeries() {
		int arr[]=new int[8];
		int n1=0;
		int n2=1;
		arr[0]=n1;
		arr[1]=n2;
		for(int index=2;index<arr.length;index++) {
			arr[index]=n1+n2;
			n1=n2;
			n2=arr[index];
		}
		
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonnaciSeries fibonnaciSeries=new FibonnaciSeries();	
		int output[]=fibonnaciSeries.getFibbonacySeries();
		for(int index=0;index<output.length;index++) {
			System.out.println(output[index]);
		}

	}

}
