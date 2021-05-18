package ravindra_J.Assignment_No_30_Second_Max_No;

public class SecondMaxNum {

	int temp,max;
	
	void findSecondMaxNum(int arr1[]){
	int max=0;
		for(int i=0;i<arr1.length;i++){
			
			for(int index=i+0; index < arr1.length; index++){
				
				if(arr1[i] > arr1[index]){
					max = arr1[i]; 
					arr1[i]=arr1[index]; 
					arr1[index] = max; 
				}
				
			}	
		}
		System.out.println(arr1[arr1.length-2]);
	}
	
	public static void main(String []args){
		int[] arr = {10,33,43,55,97,11,3};
		SecondMaxNum secondmaxnum = new SecondMaxNum();
		secondmaxnum.findSecondMaxNum(arr);
	}
}
