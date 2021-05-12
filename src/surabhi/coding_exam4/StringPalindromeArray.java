package surabhi.coding_exam4;

public class StringPalindromeArray {
	String getPalindrome(String str){
		boolean isPalindrome=true;
		str=str.toLowerCase();
		for(int index1=0, index2=str.length()-1; index1<=index2; index1++, index2--){
			if(!(str.charAt(index1)==str.charAt(index2))){
				isPalindrome=false;
				break;
			}
		}
		if(isPalindrome){
			return str;
		}else
			return "";
	}

	String [] displayPaindromeStrings(String arr[]){
		String[] palindromeArr=new String[arr.length];
		int count=0;
		String str="";
		for(int index=0;index<arr.length;index++){
			if(count<palindromeArr.length){
				str=getPalindrome(arr[index]);
				if(!str.isEmpty()){
					palindromeArr[count]=arr[index];
					count++;
					str="";
				}
			}
		}
			return palindromeArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPalindromeArray stringPalindromeArray=new StringPalindromeArray();
		String str= "Hi MAM hello NamaN techno";
		String arr1[]=str.split(" ");
		String arr2[]=new String[arr1.length];
		arr2=stringPalindromeArray.displayPaindromeStrings(arr1);
		for(int index=0; index<arr2.length;index++) {
			if(arr2[index]!=null)
			System.out.println(arr2[index]);
		}
	}

}
