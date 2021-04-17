package siddhant.Assignment18;

public class PrintAscci{
	int getvalue(char ch){
		return ch;
	}
	
	public static void main(String[]args){
		PrintAscci PA =  new PrintAscci();
		int i = PA.getvalue('H');
		System.out.println("The ascci value for the character H is : " +i);
	}
}