package dipali;

public class Assignment23P4 {

	public int findAvgOfPrimeNumber(int start , int end) {
		int count=0, average =0;
		for(int cnt=start;cnt<=end;cnt++) {
			int num =0 , sum=0;
			int counter=0; 	  
	          for(num =cnt; num>=1; num--) {
	             if(cnt%num==0){
	            	 counter = counter + 1;
	            	
		     }
		  }
	          if (counter == 2) {
	        	  count++; 
	        	  sum=sum+cnt;
	        	  average=sum/count;
	            }
	          
	          if(sum!=0 && count!=0) {
	        	  average=sum/count;
	          }
		}
		return average;
	}
	public static void main(String[] args) {
		Assignment23P4 assignment23p4=new Assignment23P4();
		int ave=assignment23p4.findAvgOfPrimeNumber(2, 100);
		System.out.println("average of all prime number in range 2 to 100 is "+ave);
	}

}
