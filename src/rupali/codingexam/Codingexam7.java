package rupali.codingexam;

public class Codingexam7 {
	int getAns(int[] arr){
		int temp=0;
		for(int i=0;i<arr.length;i++){
			temp=temp +arr[i];
		}
		int total=(10*(10+1))/2;
		return total-temp;
	}
	public static void main(String[] args){
		int arr[]={1,3,4,7,9,10};
		Codingexam7 codingexam7= new Codingexam7();
		int output=codingexam7.getAns(arr);
		System.out.println("Output: "+ output);
	}
}


