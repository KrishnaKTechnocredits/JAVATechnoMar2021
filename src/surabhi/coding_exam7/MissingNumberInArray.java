package surabhi.coding_exam7;

public class MissingNumberInArray {
	int displayHighestMissingNumber(int[] arr){
		int highest=0;boolean isPresent=false;
		for(int num=1;num<=10;num++){
			isPresent=false;
			for(int index=0;index<arr.length;index++){
				if(num==arr[index]){
					isPresent=true;
					break;
				}
			}
			if(!isPresent && highest<num) {
				highest=num;
			}
		}
		return highest;
	}
	
	int displaySumOfMissingNumbers(int[] arr){
		int sum=0;boolean isPresent=false;
		for(int num=1;num<=10;num++){
			isPresent=false;
			for(int index=0;index<arr.length;index++){
				if(num==arr[index]){
					isPresent=true;
					break;
				}
			}
			if(!isPresent) {
				sum+=num;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumberInArray missingNumberInArray=new MissingNumberInArray();
		int [] arr={1,3,4,7,9,10};
		int sum=missingNumberInArray.displaySumOfMissingNumbers(arr);
		System.out.println(sum);
		int highest=missingNumberInArray.displayHighestMissingNumber(arr);
		System.out.println(highest);
		
	}

}
