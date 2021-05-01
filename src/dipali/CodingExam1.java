package dipali;

public class CodingExam1 {
	
	public void getIndicesOfTwoNumbers(int [] arr , int targetNum) {
		if(!(arr == null)) {
			int len=arr.length;
			int counter=1;
			for(int cnt=0 ; cnt<len-1 && counter<len;counter++) {
				if(arr[cnt]+arr[counter]==targetNum) {
					System.out.println("Values of index are "+cnt+"-"+(counter-cnt));
					cnt++;
					counter=1;
				}	
		 }
				
		}		
	}
	
	public static void main(String[] args) {
		CodingExam1 codingexam1=new CodingExam1();
		int[] arr = {2,11,15,7,4};
		codingexam1.getIndicesOfTwoNumbers(arr, 9);
	}
}
