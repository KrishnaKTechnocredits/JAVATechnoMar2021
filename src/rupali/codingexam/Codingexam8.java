package rupali.codingexam;

public class Codingexam8 {
	int getAns(int[] arr) {
		int temp=0;
		for(int i=arr.length-1;i>0;i--) {
			if((arr[i]-1)!=arr[i-1]) {
				temp=arr[i]-1;
				break;
			}
		}
			return temp;
	}
	
	public static void main(String[] args){
		int arr[]={1,3,4,7,9,10};
		Codingexam8 codingexam8= new Codingexam8();
		int output=codingexam8.getAns(arr);
		System.out.println("Output: "+ output);
	}

}
