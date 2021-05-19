package surabhi.coding_exam5;

public class ReverseArrayString{
	String getReverse(String str){
		StringBuffer sb=new StringBuffer(str);
		return sb.reverse().toString();
	}

	String[] getReverseWords(String[] arr){
		String[] reverseArr=new String[arr.length];
		for(int index=0;index<arr.length;index++){
			reverseArr[index]=getReverse(arr[index]);	
		}
		return reverseArr;
	}
	public static void main(String[] args){
		ReverseArrayString reverseArrayString=new ReverseArrayString();
		String str="hi hello how are you";
		if(!str.isEmpty()){
			String arr[] =str.split(" ");
			String revArr[]=new String[arr.length];
			revArr=reverseArrayString.getReverseWords(arr);
			for(int index=0;index<revArr.length;index++) {
				System.out.println(revArr[index]);
			}	
		}else
			System.out.println("String is empty");
	}
}