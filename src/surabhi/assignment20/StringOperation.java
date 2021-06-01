package surabhi.assignment20;

public class StringOperation {
	int letterCount, upperCount, lowerCount, specialCount, digitCount;
	
	void findCount(String str) { 
		char ch=' ';
		 for(int index=0;index<str.length();index++) {
			 ch=str.charAt(index);
			 if(ch>=48 && ch<=57){ 
				 digitCount++;
			 }else if((ch>=65 && ch<=90) || (ch>=97 && ch<=122)) { 
				 if(ch>=65 && ch<=90) {
					 upperCount++;
				 } else {
					 lowerCount++;
				 }
				 letterCount++;
			 }else if(ch>=32)
				 specialCount++; 
		 }
	} 
	
	void displayCount() {
		System.out.println("Total Digit :"+digitCount+"\n Total Letters :"+letterCount+"\n Total UpperCase :"+upperCount+"\n Total LowerCase :"+lowerCount+"\n Total special character count :"+specialCount);
	}
	public static void main(String[] args) {
		StringOperation stringOperation=new StringOperation(); 
		stringOperation.findCount("1rRpd3F9#K(E");
		stringOperation.displayCount();
	}

}
