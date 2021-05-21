package surabhi.coding_exam7;

public class MissingNumberInArray2 {
	int displayHighestMissingNumber(int[] arr2){
		int highest=arr2[0];
			for(int index=1;index<arr2.length && arr2[index]!=0;index++){
				if(highest<arr2[index]) {
					highest=arr2[index];
				}
			}
			return highest;
		}
	
	int[] displaySumOfMissingNumbers(int[] arr){
		int sum=0;boolean isPresent=false;
		int count=0; int[] arr2=new int[arr.length];
		for(int num=1;num<=10;num++){
			isPresent=false;
			for(int index=0;index<arr.length;index++){
				if(num==arr[index]){
					isPresent=true;
					break;
				}
			}
			if(!isPresent) {
				if(count<arr.length) {
					arr2[count]=num;
					count++;
				}
				sum+=num;
			}
		}
		System.out.println(sum);
		return arr2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumberInArray2 missingNumberInArray=new MissingNumberInArray2();
		int [] arr={1,3,4,9,7,10};
		int[] arr2=missingNumberInArray.displaySumOfMissingNumbers(arr);
		int highest=missingNumberInArray.displayHighestMissingNumber(arr2);
		System.out.println(highest);
		
	}

}
