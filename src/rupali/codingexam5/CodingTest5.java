package rupali.codingexam5;

public class CodingTest5 {
	String getRevWordString(String input){
		String arr[]=input.split(" ");
		String temp="";
		for(int i=0;i<arr.length;i++){
			for(int j=arr[i].length()-1;j>=0;j--){
				temp=temp+ arr[i].charAt(j);
			}
			temp=temp+" ";
		}
		return temp;
	}
	public static void main(String[] args){
		CodingTest5 codingtest5=new CodingTest5();
		String output=codingtest5.getRevWordString("hi hello how are you");
		System.out.println(output);
	}
}
