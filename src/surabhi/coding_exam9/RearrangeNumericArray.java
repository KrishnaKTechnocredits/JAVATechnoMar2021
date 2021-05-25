package surabhi.coding_exam9;

/*Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]*/
		
public class RearrangeNumericArray {
	int[] getArrangedArray(int[] arr) {
		int count=0;
		int output[] =new int[arr.length];
		for(int index=0; index<arr.length;index++) {
			if(arr[index]!=output[count] && arr[index]!=0) {
				output[count]=arr[index];
				count++;
			}
		}
		for(int index=count;index<arr.length;index++) {
			output[count]=0;
			count++;
		}
		
		return output;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RearrangeNumericArray rearrangeNumericArray=new RearrangeNumericArray();
		int arr[]= {1,3,0,3,0,6,0,9,23,45};
		int output[]=rearrangeNumericArray.getArrangedArray(arr);
		for(int index=0;index<output.length;index++) {
			System.out.println(output[index]);
		}
	}

}
