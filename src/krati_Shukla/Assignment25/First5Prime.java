//Write a method which will return first 5 prime numbers from given range. Main method should print the output.

package krati_Shukla.Assignment25;

import java.util.Scanner;

public class First5Prime {
       int count = 0;

       int IsPrime(int targetNum) {
             boolean primeFlag = true;
             int output=0;

             for (int index = 2; index <= targetNum / 2; index++) {
                    if (targetNum % index == 0) {
                          primeFlag = false;
                          break;
                    }
             }
             if (primeFlag && count != 5) {
                    output = targetNum;
                    count = count + 1;
             }
             return output;
       }

       void PrimeCount(int startNum, int endNum) {
             for (int num = startNum; num <= endNum; num++) {
                    int range = IsPrime(num);
                    if(range !=0)
                    System.out.println("Prime Number is " + range);
             }
       }

       public static void main(String[] a) {
             First5Prime firstPrime = new First5Prime();
             Scanner sc = new Scanner(System.in);
             System.out.println("Enter the start Index");
             int start = sc.nextInt();
             System.out.println("Enter the end Index");
             int end = sc.nextInt();
             firstPrime.PrimeCount(start, end);
       }

}
