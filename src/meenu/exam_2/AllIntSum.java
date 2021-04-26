package meenu.exam_2;

/*WAP to do sum of all the integer from the given string

Input: String str = "12h14i4w8sdc15"

Output: 12+14+4+8+15 = 53
*/

import java.util.Scanner;

public class AllIntSum {
	
	int getSumOfInt(String word) {
		int sum = 0;
		for(int index = 0;index<word.length();index++) {
			if(Character.isDigit(word.charAt(index)))
				if(index < word.length()-1 && Character.isDigit(word.charAt(index+1)))	{	
					sum = sum + Character.getNumericValue(word.charAt(index))*10+ Character.getNumericValue(word.charAt(index+1));				
					index+=1;
				}else
					sum = sum + Character.getNumericValue(word.charAt(index));
		}		
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String word = scanner.next();
		AllIntSum allIntSum = new AllIntSum();
		System.out.println("Sum of all interger in given string : "+allIntSum.getSumOfInt(word));
	}
}
