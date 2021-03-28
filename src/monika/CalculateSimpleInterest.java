package monika;

/* Asisgnment2: 
 3. Write a Java program to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate*/
		
		
class CalculateSimpleInterest{
void simpleInterestCalc(int amount,int time, int rate){
	int answer = (amount*time*rate)/100;
	System.out.println("Simple interest is calculated as : " +answer);
}
public static void main(String[] args){
	CalculateSimpleInterest calculateSimpleInterest = new CalculateSimpleInterest();
	calculateSimpleInterest.simpleInterestCalc(1000,2,10);
}
}