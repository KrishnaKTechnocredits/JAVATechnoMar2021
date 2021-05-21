/*
Program 3:  Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
*/
package ravindra_J.Assignment_No_25_Prime_and_Array_Op;

public class StringDigitSum {

	int[] SumofArrayStringDigit(String str1[]) {
		int ans[] = new int[str1.length];
		int num=0;
		for(int i=0; i<str1.length;i++) {
			int sum=0;
			String word=str1[i];
			for(int index=0;index < word.length();index++) {
				char ch=word.charAt(index);
				if(Character.isDigit(ch)) {
					int temp=Integer.parseInt(String.valueOf(ch));
					sum=sum+temp;
				}
			}
			ans[num]=sum;
			num++;
		}
		return ans;
	}
	public static void main(String[] args) {
		StringDigitSum stringDigitSum=new StringDigitSum();

		String str[]={"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"};
		int a[]=stringDigitSum.SumofArrayStringDigit(str);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
