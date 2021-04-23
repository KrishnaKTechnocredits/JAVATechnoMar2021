/*
 * Assignment - 23 : 18th April'2021

Write a program with different method to satisfy following requirement. 
1) validate whether given number is prime or not.
2) print all the prime numbers given range.
   input : 40 to 100
   output : 
3) count all the prime numbers given range.
   input : 2 to 100
   output : 
4) sum of all the prime numbers given range.
   input : 2 to 100
   output : 
5) Average of all the prime numbers given range.
   input : 2 to 100
   output : 



 */
package rupali.assignment23;

public class Primeno {
		void isprime(int num) {
			int i;
			for( i=2;i<num;i++) {
				if(num%i == 0) {
					System.out.println(num+"No. is not prime");
					break;
				}
			}
			if(num==i)
				System.out.println(num+"No. is prime");
			
		}
		void printprime(int start,int end) {
			int i,j;
			for( i=start;i<end;i++) {
				for(j=2;j<i;j++) {
					if(i%j == 0) {
						break;
					}
				}
				if(j==i)
					System.out.println(i+" is prime number");
			}
			
		}
		
		void sumprime(int start,int end) {
			int i,j,sum=0;
			for( i=start;i<end;i++) {
				for(j=2;j<i;j++) {
					if(i%j == 0) {
						break;
					}
				}
				if(j==i)
					sum=sum+i;
			}	
			System.out.println("Sum of all prime numbers in the range "+start+" to "+end+" is "+sum);
		}
		void avgprime(int start,int end) {
			int i,j,sum=0;
			for( i=start;i<end;i++) {
				for(j=2;j<i;j++) {
					if(i%j == 0) {
						break;
					}
				}
				if(j==i)
					sum=sum+i;
			}	
			System.out.println("Average  of all prime numbers in the range "+start+" to "+end+" is "+(sum/(end-start)));
		}
		
		void countprime(int start,int end) {
			int i,j,count=0;
			for( i=start;i<end;i++) {
				for(j=2;j<i;j++) {
					if(i%j == 0) {
						break;
					}
				}
				if(j==i) {
					//System.out.println(i+" is prime number");
					count++;
				}
			}
			System.out.println(count+" prime numbers are there in the range of"+start+" to "+end);
		}
		
		
		public static void main(String[] args) {
			Primeno primeno=new Primeno();
			System.out.println("Validation for number is prime or not");
			primeno.isprime(44);
			primeno.isprime(19);
			primeno.printprime(40,100);
			primeno.countprime(2, 100);
			primeno.sumprime(2, 100);
			primeno.avgprime(2, 100);
		}
}
