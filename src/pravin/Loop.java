/*Assignment 8
 *Write only one program having following methods. [4 methods in same program]

 *1. On user define range print all even Numbers.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 15
Output : Even Numbers are:
		 10
		 12
		 14	

2. On user define range print all Numbers which is divisible by 5.
Hint : pass start and end index as a parameter.
Input : Range -> 10 to 30
Output : Divisible by 5, Numbers are:
		 10
		 15
		 20
		 25
		 30	

3. On user define range print all Numbers which is divisible by 5 and divisible by 3.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 18
Output : Divisible by 5 & 3, Numbers are:
		 15

4. On user define range print all Numbers which is divisible by 7 or 13.
Hint : pass start and end index as a parameter.
Input : Range -> 5 to 40
Output : Divisible by 7 or 13, Numbers are:
		 7 is divisible by 7
		 13 is divisible by 13
		 14 is divisible by 7
		 21 is divisible by 7
		 26 is divisible by 13
		 28 is divisible by 7
		 35 is divisible by 7
		 39 is divisible by 13*/


package pravin;

public class Loop {

	void evenstartNum(int startNum,int endNum) {
		while(startNum<=endNum){
			if(startNum %2 == 0)
				System.out.println("Even Numbers are "+startNum);
			startNum++;
		}
	}
	void divisableby5(int startNum,int endNum) {
		while(startNum<=endNum){
			if (startNum %5 == 0)
				System.out.println("Divisableby 5 Numbers are "+startNum);
			startNum++;
		}
	}
	void divisableby5n3(int startNum,int endNum) {
		while(startNum<=endNum){
			if (startNum %5 == 0 && startNum %3 == 0)
				System.out.println("Divisableby 5n3 Numbers are "+startNum);
			startNum++;
		}
	}

	void divisableby7n13(int startNum,int endNum) {
		while(startNum<=endNum){
			if (startNum %7 == 0)
				System.out.println(startNum+" Divisableby 7");
			else if (startNum %13 == 0)
				System.out.println(startNum+" Divisableby 13");
			startNum++;
		}
	}
	public static void main(String[] args) {
		Loop Loop = new Loop();
		Loop.evenstartNum(10,15);
		Loop.divisableby5(10,30);
		Loop.divisableby5n3(5,18);
		Loop.divisableby7n13(5,40);
	}
}
