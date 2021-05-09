package shivani.Assignment_30;
/*WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55*/ 
public class FindSecandMaxFromAraay {
	int max=0;
	int secMax=0;
	int findMaxArray(int[] arr) {
		for(int i =0;i<arr.length;i++) {
			for(int index1=i+1;index1<arr.length;index1++)
			if(arr[i]>arr[index1]) {
				max=arr[i];
				arr[i]=arr[index1];
				arr[index1]=max;
				
			}
		}
		return arr[arr.length - 2];
	}
	
	public static void main(String[] args) {
		
		FindSecandMaxFromAraay findSecandMaxFromAraay = new FindSecandMaxFromAraay();
		int [] arr= {10,33,43,55,97,11,3};
		int output=findSecandMaxFromAraay.findMaxArray(arr);
		System.out.println(output);
	}

}
