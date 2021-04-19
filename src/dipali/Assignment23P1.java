package dipali;

public class Assignment23P1 {
	
	public void findPrimeNumber(int start , int end) {
		
		for(int cnt=start;cnt<=end;cnt++) {
			int num =0;
			int counter=0; 	  
	          for(num =cnt; num>=1; num--) {
	             if(cnt%num==0){
	            	 counter = counter + 1;
		     }
		  }
	          if (counter ==2) {
	        	  System.out.println(cnt);
	            }
		}
	}

	public static void main(String[] args) {
		Assignment23P1 assignment23p1=new Assignment23P1();
		assignment23p1.findPrimeNumber(40, 100);
	}
}
