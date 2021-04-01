package gaurav;

public class DivisionCalculate 
{
	void vision(int start,int end) 
	{
		for(int i=start;i<=end;i++) 
		{ 
			
		    if(i%7==0) 
			 {
			  System.out.println(i +" is divisible by 7");
			 }
			  else if(i%3==0)
			 {
				System.out.println(i+" is divisible by 3");
			 }
		  
	   }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisionCalculate DivisionCalculate1 = new DivisionCalculate();
		DivisionCalculate1.vision(5,40);

}

}
