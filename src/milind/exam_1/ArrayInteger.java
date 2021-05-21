package milind.exam_1;

public class ArrayInteger {
	
	int[] targetSum(int[]a,int targetNum) {
		
		 int expectNum[]=new int[2];
		 for(int index=0;index < a.length;index++){
			 int firstIndex=a[index];
		 
		 for(int innerIndex=0;innerIndex < a.length;innerIndex++) {
			 if((firstIndex +a[innerIndex])==targetNum) {
				 expectNum[0]=innerIndex;
				 expectNum[1]=index;
			 }
		 }
	}
	return expectNum;
}
public static void main(String[] args) {
	 ArrayInteger  arrayInteger=new  ArrayInteger();
	 int[] a= {2,11,15,7,4};
	 int targetNum=9;
	 int expectNum []=new int[2];
	 expectNum=arrayInteger.targetSum(a, targetNum);
	 System.out.println("output : [" +expectNum[0] + "," +expectNum[1] + "]");
  }
}
