package surabhi.coding_exam_2;

public class SumOfIntegersInString {
	
	void findSumFromString(String str) { 
		 int sum=0; String temp="";
		 for(int index=0;index<str.length();index++) {
			  if(Character.isDigit(str.charAt(index))) {
				  temp=temp+str.valueOf(str.charAt(index));
			  }else {
				  if(!temp.equals("")) {
					  sum=sum+Integer.parseInt(temp);
					  temp="";
				  }
			  }
		 } 
		  if(!temp.equals("")) {
			  sum=sum+Integer.parseInt(temp);
		  }
		 System.out.println("Sum of numbers is :"+sum);
		 
	}
	public static void main(String[] args) {
		SumOfIntegersInString sumOfIntegersInString=new SumOfIntegersInString(); 
		String str="12hbd14i4w8sdc15";
		sumOfIntegersInString.findSumFromString(str);

	}

}
