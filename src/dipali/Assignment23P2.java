package dipali;

public class Assignment23P2 {

	public int findPrimeNumber(int start , int end) {
		int count=0 , sum =0;
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
		return count;
	}

	public static void main(String[] args) {
		Assignment23P2 assignment23p2=new Assignment23P2();
		int count =assignment23p2.findPrimeNumber(2, 100);
		System.out.println("Count of all prime number in range 2 to 100 is "+count);
	}
}
