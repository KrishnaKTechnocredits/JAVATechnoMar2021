package siddhant;
public class Divisiblefive{
	void divisible(int start,int end){
		for(int index = start; index<=end; index++){
			if(index%5==0){
				System.out.println("\n The number divisible by five are : " +index);
			}
		}
	}
	public static void main(String[]args){
		Divisiblefive df = new Divisiblefive();
		df.divisible(10,30);
	}
}
