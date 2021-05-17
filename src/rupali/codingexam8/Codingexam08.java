package rupali.codingexam8;

public class Codingexam08 {
	int[] getuniquenum(int[] input){
		
		int []output= new int[input.length];
		int temp=0;
		for(int i=0;i<input.length;i++){
			if(input[i]!=0) {
				output[temp]=input[i];
				temp++;
			}
				for(int j=i+1;j<input.length;j++){
					if(input[i]==input[j]){
						input[j]=0;
					}
				}
		}
		return output;
	}
	public static void main(String[] args){
		int []input={10,2,3,10,3,55,61,2};
		Codingexam08 codingexam08= new Codingexam08();
		int arr[]=codingexam08.getuniquenum(input);
			for(int i=0;i<arr.length;i++) {
				if(arr[i]!=0)
				System.out.println(arr[i]);
			}
	}	
}
