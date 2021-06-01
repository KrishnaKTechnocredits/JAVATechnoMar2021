package dipali;

public class ArrayAssignment5 {
	
	public boolean isTargetNoPresentInArray(int[] input, int targetNo) {
		boolean val;
		val=false;
		if(!(input == null)) {
			int arrLen=input.length;	
			for(int cnt=0;cnt<arrLen;cnt++) {
				if(input[cnt] == targetNo) {
					val=true;
					break;
				}
			}
		}
		return val;
	}
	public static void main(String[] args) {
		int[] arr= {10,23,23,44,23,10,23,4,23};
		boolean Value=new ArrayAssignment5().isTargetNoPresentInArray(arr, 45);
		if(Value)
			System.out.println("Number 45 is present in given array");
		else
			System.out.println("Number 45 does is not present in given array");
	}
}
