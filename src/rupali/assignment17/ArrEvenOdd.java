/*
 * Program 1:  From given numbers, count the odd and even numbers.
input : 10,23,26,27,88,87,65 
output : even -> 3
      odd ->  array.length - evenCount
	  
 */
package rupali.assignment17;
import java.util.Scanner;

public class ArrEvenOdd {
	
	void getEvenOddcount() {
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the legnth of Array");
		int l=s.nextInt();
		System.out.println("Enetr the intgers for array");
		int[] array= new int[l];
		for(int i=0;i<array.length;i++) 
			array[i]=s.nextInt();
					
		for(int index=0;index<array.length;index++) {
			if( array[index]%2==0 )
				count++;
		}
		System.out.println("Even nos among given numbres are:"+count);
		System.out.println("Even nos among given numbres are:"+(array.length-count));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new ArrEvenOdd().getEvenOddcount();
	}

}
