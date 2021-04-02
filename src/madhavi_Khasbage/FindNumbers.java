package madhavi_Khasbage;

public class FindNumbers {
	void printEvenNumber(int indexStart,int indexEnd) {				
		if(indexStart>0 && indexEnd>0){
			System.out.println("Even numbers are:\n");			
			while(indexStart<=indexEnd){				
				if(indexStart % 2==0) {
					System.out.println(indexStart + "\r\n");
				}		
				indexStart++;
			}			
		}else{
			System.out.println("Even Number : Please enter start and end index greater than 0.");
		}
	}
	
	void printNumDivisibleByFive(int indexStart,int indexEnd) {
		if(indexStart>0 && indexEnd>0) {
			System.out.println("Divisible by 5, numbers are:\n");
			while(indexStart<=indexEnd){				
				if(indexStart % 5==0) {
					System.out.println(indexStart + "\r\n");
				}		
				indexStart++;
			}
		}else{
			System.out.println("Divisible by 5 : Please enter start and end index greater than 0.");
		}
	}
	
	void printNumDivisibleByFiveAndThree(int indexStart,int indexEnd) {
		if(indexStart>0 && indexEnd>0) {
			System.out.println("Divisible by 5 and 3, numbers are:\n");
			while(indexStart<=indexEnd){				
				if(indexStart % 5 == 0 && indexStart % 3 == 0){
					System.out.println(indexStart + "\r\n");
				}		
				indexStart++;
			}			
		}else{
			System.out.println("Divisible by 5 and 3 : Please enter start and end index greater than 0.");
		}
	}
	
	void printNumDivisibleBySevenAndThirteen(int indexStart,int indexEnd) {
		if(indexStart>0 && indexEnd>0) {
			System.out.println("Divisible by 7 and 13, numbers are:\n");
			while(indexStart<=indexEnd){					
				if(indexStart % 7 == 0) {
					System.out.println(indexStart + " is divisible by 7 \r\n");
				}	
				if(indexStart % 13 == 0){
					System.out.println(indexStart + " is divisible by 13 \r\n");
				}
				indexStart++;
			}
		}else{
			System.out.println("Divisible by 7 and 13 : Please enter start and end index greater than 0.");
		}
	}	
	
	public static void main(String[] args) {
		RangePrint rangeprint1=new RangePrint();
		rangeprint1.printEvenNumber(10,20);
		rangeprint1.printNumDivisibleByFive(10,40);
		rangeprint1.printNumDivisibleByFiveAndThree(10,50);
		rangeprint1.printNumDivisibleBySevenAndThirteen(5,40);		
	}
}
