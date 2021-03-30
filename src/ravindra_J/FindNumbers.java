/*
Assignment 6 : 30th March 2021

Write only one program having following methods. [4 methods in same program]

1. On user define range print all even numbers.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even numbers are:
2. On user define range print all numbers which is divisible by 5.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user define range print all numbers which is divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, numbers are:
		 15

4. On user define range print all numbers which is divisible by 7 or 13.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13

 */
package ravindra_J;
public class FindNumbers {
	int startNum, endNum;

	void printEvenNumber(int start,int end){
		startNum = start;
		endNum = end;
		if(startNum >0 && endNum >= startNum){
			System.out.print("Even numbers between "+startNum+ " & " +endNum+" are: ");

			for(int index=0;index<=endNum && startNum<=endNum;index++){
				if(startNum%2==0){
					System.out.print(" "+startNum);
				}
				startNum++;
			}
		}
		else {
			System.out.println("");
			System.out.println("startNum or endNum should not be zero(0) and startNum should be less than endNum");
		}
	}

	void printAllNumberDiviFive(int start,int end){
		startNum = start;
		endNum = end;
		if(startNum >=0 && endNum >= startNum){
			System.out.println("");
			System.out.print("Number between "+startNum+ " & " +endNum+" divisible by 5 are: ");
			for(int index=0;index<=endNum && startNum<=endNum;index++){
				if(startNum%5==0)
					System.out.print(" "+startNum);
				startNum++;
			}
		}
		else {
			System.out.println("");
			System.out.println("startNum or endNum should not be zero(0) and startNum should be less than endNum");
		}
	}


	void printAllNumberDiviFiveAndThree(int start,int end){
		startNum = start;
		endNum = end;
		if(startNum >=0 && endNum >= startNum){
			System.out.println("");
			System.out.print("Number between "+startNum+ " & " +endNum+" divisible by 5 & 3 are: ");
			for(int index=0;index<=endNum && startNum<=endNum;index++){
				if((startNum % 5 == 0) && (startNum % 3 == 0))
					System.out.print(" "+startNum);
				startNum++;
			}
		}
		else {
			System.out.println("");
			System.out.println("startNum or endNum should not be zero(0) and startNum should be less than endNum");
		}
	}

	void printAllNumberDiviSevenAndThirteen(int start,int end){
		startNum = start;
		endNum = end;
		if(startNum >=0 && endNum >= startNum){
			System.out.println("");
			System.out.println("Number between "+startNum+ " & " +endNum+" divisible by 7 & 13 are: ");
			for(int index=0;index<=endNum && startNum<=endNum;index++){
				if(startNum % 7 == 0)
					System.out.println(startNum+" is divisible by 7 ");
				else if (startNum % 13 == 0)
					System.out.println(startNum+" is divisible by 13 ");
				startNum++;
			}
		}
		else {
			System.out.println("");
			System.out.println("startNum or endNum should not be zero(0) and startNum should be less than endNum");
		}
	}

	public static void main(String []args){
		FindNumbers findnumber = new FindNumbers();
		findnumber.printEvenNumber(10,20);
		findnumber.printEvenNumber(0,-5);// invalid
		findnumber.printAllNumberDiviFive(10, 30);
		findnumber.printAllNumberDiviFive(30, 10);// invalid
		findnumber.printAllNumberDiviFiveAndThree(5, 18);
		findnumber.printAllNumberDiviFiveAndThree(-2, 0);// invalid
		findnumber.printAllNumberDiviSevenAndThirteen(5, 40);
		findnumber.printAllNumberDiviSevenAndThirteen(50, 14);// invalid
	}

}
