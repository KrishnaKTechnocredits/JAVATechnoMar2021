package prachi.Sample_Programs;

public class FindPrimenumber {
	 void findPrimeNumber(int targetNum) {
		 /*
		using count variable:
		int count = 0;
		for(int index=1; index<targetNum ; index++) {
		if(targetNum/2==0) {
			 count=1;
			  }
			 }
			 if (count == 1)
				 System.out.println(targetNum+ ": No is not prime");
		  else
			 System.out.println(targetNum+ ": No is not prime");
		 ---------------------------
		 Using boolean:
		 boolean isPrimeFlag=true;
		 for(int index=1; index<targetNum ; index++) {
		 if(targetNum/2==0) {
			 isPrimeFlag=false;
			 }
			 }
			 if (isPrimeFlag==true)
				 System.out.println(targetNum+ ": No is not prime");
		  else
			 System.out.println(targetNum+ ": No is not prime");
			 ------------------------------------------------------------
			 using String:
		 String isPrime = "Yes";
		for(int index=1; index<targetNum ; index++) {
		if(targetNum/2==0) {
			 isPrime="No";
			  }
			 }
			 if (isPrime.equals("No"))
				 System.out.println(targetNum+ ": No is not prime");
		  else
			 System.out.println(targetNum+ ": No is not prime");
		 */
		 
		 
		 
		 int num =2;
		 for(int index=1; index<targetNum ; index++) {
			 if(targetNum/2==0) {
				 break;
			 }
			 
		 }
		 
		 if ((targetNum/2 == num))
				 System.out.println(targetNum+ ": No is  prime");
		 else
			 System.out.println(targetNum+ ": No is not prime");
		 
	 }
	 

	 public static void main(String[] args) {
		FindPrimenumber fpn = new FindPrimenumber();
		fpn.findPrimeNumber(17);
		fpn.findPrimeNumber(12);

	}
	 
}
