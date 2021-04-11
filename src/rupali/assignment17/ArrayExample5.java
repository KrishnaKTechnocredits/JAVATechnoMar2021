package rupali.assignment17;
import java.util.Scanner;
public class ArrayExample5 {

		public static void main(String[] args) {
			Scanner s1=new Scanner(System.in);
			System.out.println("Enter the legnth of Array");
			int l=s1.nextInt();
			System.out.println("Enetr the intgers for array");
			int[] number= new int[l];
			for(int i=0;i<number.length;i++) 
				number[i]=s1.nextInt();
			System.out.println("Enter the number to match");
			int t=s1.nextInt();
			ArrayExample5 arrayExample5= new ArrayExample5();
			boolean b=arrayExample5.freqoftarget(number,t);
			System.out.println(b);
			if(b==true)
				System.out.println(t+" is found in array");
			else
				System.out.println(t+" is not found in array");
			
		}
		
		boolean freqoftarget(int[] num,int target) {
			boolean flag=true;
			for (int index=0;index<num.length;index++) {
				if(num[index]==target) {
					flag=true;
					break;
				}
				else {
					flag=false;
				}
			}
			return flag;
		}


	}






