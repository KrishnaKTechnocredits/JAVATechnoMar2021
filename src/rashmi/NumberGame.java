package rashmi;
public class NumberGame{

	void findMaxNumber(int num1, int num2, int num3)
		{
			if(num1==num2 && num2==num3){
				System.out.println("Maximum numbers could not be found, all given numbers are equal");
			}else if(num1>num2 && num1>num3){
				System.out.println("Maximum number is "+num1);
			}else if(num2 > num3){
				System.out.println("Maximum number is "+num2);
			}else{
				System.out.println("Maximum number is "+num3);
				}
		}
		
		
	void findMinNumber(int num1, int num2, int num3)
		{
			if(num1==num2 && num2==num3){
				System.out.println("Minimum numbers could not be found, all given numbers are equal");
			}else if(num1<num2 && num1<num3){
				System.out.println("Minimum number is "+num1);
			}else if(num2 < num3){
				System.out.println("Minimum number is "+num2);
			}else{
				System.out.println("Minimum number is "+num3);
				}
		}
	public static void main(String[] a){
			
			NumberGame numberGame = new NumberGame();
			numberGame.findMaxNumber(2,5,6);
			numberGame.findMinNumber(2,5,6);
			numberGame.findMaxNumber(5,5,5);
			numberGame.findMinNumber(5,5,5);
		}
}
				