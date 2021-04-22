package rupali.assignment21;
import java.util.Scanner;

public class Digitsum {
	
	int isnumber(String s) {
		int count=0;
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			switch((int)ch) {
			case 48:sum=sum+0;
					break;
			case 49:sum=sum+1;
					break;
			case 50:sum=sum+2;
					break;
			case 51:sum=sum+3;
					break;
			case 52:sum=sum+4;
					break;
			case 53:sum=sum+5;
					break;
			case 54:sum=sum+6;
					break;	
			case 55:sum=sum+7;
					break;
			case 56:sum=sum+8;
					break;
			case 57:sum=sum+9;
					break;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		Digitsum digitsum=new Digitsum();
		int sum=0;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		sum=digitsum.isnumber(str);
	
		System.out.println("Sum of all digits in String is:"+sum);
	}
}
