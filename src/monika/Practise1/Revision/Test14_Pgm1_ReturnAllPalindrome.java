package monika.Practise1.Revision;

import java.util.ArrayList;
import java.util.Arrays;

public class Test14_Pgm1_ReturnAllPalindrome {

//Conventional way1 for string palindrome
private boolean isPalindrome(String input){
	boolean flag = true;
	for(int start = 0,end = input.length()-1;start<=end;start++,end--){
		if(input.charAt(start) != input.charAt(end)){
			flag = false;
			break;	
		}
	}return flag;
}

public ArrayList<String> getPalindromeArr(String[] arr){
	ArrayList<String> arrList = new ArrayList<String>();
	for(int index=0;index<arr.length;index++){
		boolean flag = isPalindrome(arr[index]);
		if(flag)
			arrList.add(arr[index]);
	}
	return arrList;
}
//---*************************--------------------------
//Conventional way2 for string palindrome
public boolean isPalindrome1(String input){
	String temp = "";
	for(int index = input.length()-1;index>=0;index--) {
		temp += input.charAt(index);
	}if(input.equals(temp))
		return true;
	else
		return false;	
}

public ArrayList<String> getPalindromeArr1(String[] arr){
	ArrayList<String> arrList = new ArrayList<String>();
	for(int index=0;index<arr.length;index++){
		boolean flag = isPalindrome1(arr[index]);
		if(flag)
			arrList.add(arr[index]);
	}
	return arrList;
}
	//modular approach using String functions


	
public ArrayList<String> getPalindromeArr2(String[] arr){
	ArrayList<String> arrList = new ArrayList<String>();
	for(String s: arr) {
		StringBuffer stringbuffer = new StringBuffer(s);
		StringBuffer originalString = new StringBuffer(s);
		stringbuffer = stringbuffer.reverse();
		if(originalString.toString().equals(stringbuffer.toString()))
			arrList.add(s);
	}
	return arrList;
}


//-------*********Main function***********-------------------------
	public static void main(String[] args) {
		Test14_Pgm1_ReturnAllPalindrome obj = new Test14_Pgm1_ReturnAllPalindrome();
		String[] arr = {"a131a","mam","naman","1acds0","marpm","wactrcaw"};
		//conventional way1 string calling
		ArrayList<String> arrList1 = obj.getPalindromeArr(arr);
		System.out.println("conventional way1 String : "+arrList1);
		System.out.println("******************");
		//conventional way2 string calling
		ArrayList<String> arrList2 = obj.getPalindromeArr1(arr);
		System.out.println("conventional way2 String : "+arrList2);
		
		//modular appraoch1 for string
		ArrayList<String> arrList3 = obj.getPalindromeArr2(arr);
		System.out.println("Modular Approach1 String : "+arrList3);
		
		System.out.println("******************");
		//conventional way1 int calling
		int[] arrInteger = {123,121,989,1221,951, 12431,123521};
		ArrayList<Integer> result = obj.getPalindromeArr(arrInteger);
		System.out.println("conventional way1 int : "+result);
		System.out.println("******************");

		//conventional way2 int calling
		ArrayList<Integer> result1 = obj.getPalindromeArr1(arrInteger);
		System.out.println("conventional way2 String : "+result1);

		
	}
	
//Conventional way1 for int palindrome	
	private boolean isPalindrome(int input){
		int temp = input, reverseNum = 0;
		while(temp > 0){
			int mod = temp % 10;
			reverseNum = (reverseNum *10)+mod;
			temp = temp / 10;
		}if(input == reverseNum)
			return true;
		else
			return false;
	}

	public ArrayList<Integer> getPalindromeArr(int[] arr){
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int index=0;index<arr.length;index++){
			boolean flag = isPalindrome(arr[index]);
			if(flag)
			arrList.add(arr[index]);
		}
		return arrList;
	}
	
	//Conventional way2 for int palindrome	
	//Not preferred way
	private boolean isPalindrome1(int input){
		int temp = input;
		String reverseNum = "";
		while(temp > 0){
			int mod = temp % 10;
			reverseNum += mod;
			temp = temp / 10;
		} int output = Integer.parseInt(reverseNum);
		
		if(input == output)
			return true;
		else
			return false;
	}

	public ArrayList<Integer> getPalindromeArr1(int[] arr){
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for(int index=0;index<arr.length;index++){
			boolean flag = isPalindrome(arr[index]);
			if(flag)
			arrList.add(arr[index]);
		}
		return arrList;
	}
	
	

}
