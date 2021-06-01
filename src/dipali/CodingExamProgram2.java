package dipali;

public class CodingExamProgram2 {
	
	public void calculateAgeDifference(int[] arr) {
		int youngerAge=0;
		int oldAge=0;
		if(!(arr == null)) {
			int len=arr.length;
			int cnt=0;
			int olderAge=0;
			for(int counter=0 ; counter<len-1;counter++) {
				if(arr[cnt]< arr[counter]) {
					youngerAge=arr[cnt];
					olderAge=arr[counter];
				}
				if( olderAge < arr[counter+1]  ) {
					oldAge = arr[counter+1];
				}
			}
			
			int differenceofAge=oldAge-youngerAge;
			System.out.println("Age difference is "+differenceofAge);
			
		}
	}
	

	public static void main(String[] args) {
		CodingExamProgram2 codingexamprogram2=new CodingExamProgram2();
		int[] arr = {7,12,56,62,25};
		codingexamprogram2.calculateAgeDifference(arr);
	}
}
