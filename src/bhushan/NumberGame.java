package bhushan;
class NumberGame{
	int no1,no2,no3,maxno,minno;
	void findMaxNumber(int n1,int n2,int n3){
		no1 = n1;
		no2 = n2;
		no3 = n3;
			if(no1>no2 && no1>no3){
				maxno = no1;
			}
			else if(no2>no3){
				maxno = no2;
			}
			else
				maxno = no3;
	}		
	void findMinNumber(int num1,int num2,int num3){
		no1 = num1;
		no2 = num2;
		no3 = num3;
			if(no1<no2 && no2<no3){
				minno = no1;
			}
			else if(no2<no3){
				minno = no2;
			}
			else
				minno = no3;	
	}	
	void displayMaxNo(){
		System.out.println("Maximum Number is: "+maxno);
		}
		void displayMinNo(){
		System.out.println("Minimum Number is: "+minno);
		}

	public static void main(String[] args){
		NumberGame NumberGame1 = new NumberGame();
		NumberGame NumberGame2 = new NumberGame();
		NumberGame1.findMaxNumber(15,25,5);
		NumberGame1.displayMaxNo();
		NumberGame2.findMinNumber(24,18,20);
		NumberGame2.displayMinNo();
		}
}