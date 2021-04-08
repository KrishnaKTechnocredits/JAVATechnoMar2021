package milind;

public class Assignment_8 {
	void evenNum(int startNum,int endNum) {
		int totalCount=1;
		System.out.println("Even Number are " );
		while(totalCount <= endNum) {
			if((startNum %2)==0){
			System.out.println(startNum);
			totalCount++;
		}
		startNum++;
		
		}
	}
	
	void divisiableBy5(int startNum1,int endNum1) {
		int totalCount=1;
		System.out.println("Number Divisiable By 5 is " );
		while(totalCount<=endNum1) {
			if(startNum1 %5==0) {
			System.out.println(startNum1);	
			totalCount++;
		}
			startNum1++;
		}
	}
	void divisiableBy5and3(int startNum2,int endNum2) {
		int totalCount=1;
		System.out.println("Number Divisiable By 5 and 3 is " );
		while(totalCount<=endNum2) {
			if(startNum2 %5==0 && startNum2 %3 ==0 ) {
			System.out.println(startNum2);	
			totalCount++;
		}
			startNum2++;
		}
	}
	
	
	void divisiableBy70and13(int startNum3,int endNum3) {
		int totalCount=1;
		System.out.println("Number Divisiable By 7 & 13 is ");
		while (totalCount<=endNum3) {
			if((startNum3%7 ==0) || (startNum3%13 ==0)) {
				if(startNum3%7 ==0)
					System.out.println(startNum3 + " is divisible by 7");
				if(startNum3%13 ==0)
					System.out.println(startNum3 + " is divisible by 13");
				totalCount++;
			}
			startNum3++;
		}
	}
	public static void main(String[] a) {
		Assignment_8 assignment=new Assignment_8();
		assignment.evenNum(10,15);
		assignment.divisiableBy5(1,3);
		assignment.divisiableBy5and3(1,7);
		assignment.divisiableBy70and13(1,8);
		
	}

}
