/*
 * Assignment - 25 : 18th April'2021

Program 1:  Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
 

Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4

 */
package rupali.assignment25;

public class Primeno {
	int[] printprime(int start,int end) {
		int i,j,count=0;
		int[] arr=new int[5];
		for( i=start;i<end;i++) {
			for(j=2;j<i;j++) {
				if(i%j == 0) {
					break;
				}
			}
				if(j==i){
					if(count<5) {
					arr[count]=j;
					count++;
					}
				}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Primeno primeno = new Primeno();
		int[] array= new int[5];
		int i;
		System.out.println("First five prime numbers in the range 10 to 50");
		array=primeno.printprime(10, 50);
		for(i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}

}
