package ami.Assignment_32;
/*Assignment - 32 : 4th May'2021
program 1: swap 2 String using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"

program 2: swap 2 String without using temporary variable.
input : input1 = "Techno" , input2 = "Credits";
output : input1 = "Credits", input2 = "Techno"
*/
class SwapString{	
	void swapUsingTemp(String firstStr, String secondStr){
		System.out.println("*** with temp ***");
	System.out.println("Old String "+firstStr+" " + secondStr);
		String tempStr = firstStr;
		firstStr = secondStr;
		secondStr = tempStr;
		System.out.println("New String "+firstStr+" " + secondStr);
	}
	
	void swapWithoutUsingTemp(String firstStr, String secondStr){
		System.out.println("*** without temp ***");
		System.out.println("Old String "+firstStr+" " + secondStr);
		firstStr = firstStr.concat(secondStr).substring(firstStr.length(), firstStr.concat(secondStr).length());
		secondStr = firstStr.concat(secondStr).substring(0, firstStr.length());
		System.out.println("New String "+firstStr+" " + secondStr);
		}

public static void main (String[] args){
	SwapString swapString = new SwapString();
	swapString.swapUsingTemp("Techno","Credit");
	swapString.swapWithoutUsingTemp("Techno","Credit");
	}
}