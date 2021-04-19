package milind;

public class Numbers_6 {
	
	void even(int startNum,int endNum) {
		System.out.println("All Even Numbers Between " +startNum+ " n " +endNum);
		for(int i=startNum;i<endNum;i++)
			if(i%2==0)
				System.out.println(i);
	}
	
	void divisionBy5(int divStart,int divEnd) {
		System.out.println("All Numbers divisible by 5 is  " +divStart+ " n " +divEnd);
		for(int i=divStart;i<divEnd;i++)
			if(i%5==0)
				System.out.println(i);
	}
	
	void divisionBy5and3(int divstart,int divend) {
		System.out.println("All Numbers divisible by 5 and 3 is  " +divstart+ " n " +divend);
		for(int i=divstart;i<divend;i++)
			if(i%3==0 && i%5==0)
				System.out.println(i);
	}
	
	void divisionBy7and13(int divStart,int divEnd) {
		System.out.println("All Numbers divisible by 7 and 13 is  " +divStart+ " n " +divEnd);
		for(int i=divStart;i<divEnd;i++)
			if(i%7==0 && i%13==0)
				System.out.println(i);
	}
	
	public static void main(String[] args) {
		Numbers_6 number=new Numbers_6();
		number.even(10,15);
		number.divisionBy5(5, 30);
		number.divisionBy5and3(5, 18);
		number.divisionBy7and13(5, 40);
	}
	}

