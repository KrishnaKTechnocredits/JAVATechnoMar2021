package madhavi_Khasbage;

public class RangePrint {	
	
	void printEvenNumber(int indexStart,int indexEnd) {				
		if(indexStart>0 && indexEnd>0) {
			System.out.println("Event numbers are:\n");
			for(int i=indexStart;i<=indexEnd;i++){				
				if(i % 2==0) {
					System.out.println(i + "\r\n");
				}					
			}
		}else{
			System.out.println("Even Number : Please enter start and end index greater than 0.");
		}
	}
	
	void printNumDivisibleByFive(int indexStart,int indexEnd) {
		if(indexStart>0 && indexEnd>0) {
			System.out.println("Divisible by 5, numbers are:\n");
			for(int i=indexStart;i<=indexEnd;i++){				
				if(i % 5==0) {
					System.out.println(i + "\r\n");
				}					
			}
		}else{
			System.out.println("Divisible by 5 : Please enter start and end index greater than 0.");
		}
	}
	
	void printNumDivisibleByFiveAndThree(int indexStart,int indexEnd) {
		if(indexStart>0 && indexEnd>0) {
			System.out.println("Divisible by 5 and 3, numbers are:\n");
			for(int i=indexStart;i<=indexEnd;i++){				
				if(i % 5 == 0 && i % 3 == 0) {
					System.out.println(i + "\r\n");
				}					
			}
		}else{
			System.out.println("Divisible by 5 and 3 : Please enter start and end index greater than 0.");
		}
	}
	
	void printNumDivisibleBySevenAndThirteen(int indexStart,int indexEnd) {
		if(indexStart>0 && indexEnd>0) {
			System.out.println("Divisible by 7 and 13, numbers are:\n");
			for(int i=indexStart;i<=indexEnd;i++){				
				if(i % 7 == 0) {
					System.out.println(i + " is divisible by 7 \r\n");
				}	
				if(i % 13 == 0){
					System.out.println(i + " is divisible by 13 \r\n");
				}
			}
		}else{
			System.out.println("Divisible by 7 and 13 : Please enter start and end index greater than 0.");
		}
	}	
	
	public static void main(String[] args) {
		RangePrint rangeprint1=new RangePrint();
		rangeprint1.printEvenNumber(10,20);
		rangeprint1.printNumDivisibleByFive(10,30);
		rangeprint1.printNumDivisibleByFiveAndThree(10,50);
		rangeprint1.printNumDivisibleBySevenAndThirteen(5,40);		
	}
}
