package dipali;

public class Assignment23P3 {
	
	public int findSumOfPrimeNumber(int start , int end) {
		int count=0, sum =0;
		for(int cnt=start;cnt<=end;cnt++) {
			int num =0;
			int counter=0; 	  
	          for(num =cnt; num>=1; num--) {
	             if(cnt%num==0){
	            	 counter = counter + 1;
	            	
		     }
		  }
	          if (counter == 2) {
	        	  count++; 
	        	  sum=sum+cnt;
	            }
		}
		return sum;
	}

	public static void main(String[] args) {
		Assignment23P3 assignment23p3=new Assignment23P3();
		int sum=assignment23p3.findSumOfPrimeNumber(2, 100);
		System.out.println("Sum of all prime number in range 2 to 100 is "+sum);

	}

}
