package trupti.CodingExam8;

public class UniqueNumber {
	int [] getUniqueElement(int []arr) {
		int [] output= new int [arr.length];
		int lastOpIndex;
		output[0]=arr[0];
		lastOpIndex=0;
		
		for(int index=1;index<arr.length;index++) {
			boolean isNumPresent=false;
			int innerIndex=0;
			for(;innerIndex<output.length;innerIndex++) {
				if(arr[index]==output[innerIndex])
					isNumPresent=true;
			}
			if(isNumPresent==false) {
				lastOpIndex++;
				output[lastOpIndex]=arr[index];
			}
		}
		return output;
	}

	
	public static void main(String[] args) {
		UniqueNumber uniquenumber=new UniqueNumber();
		int[]input= {10,2,3,10,3,55,61,2};
		int[]answer=uniquenumber.getUniqueElement(input);
		System.out.println("Uniuq number from given array are : ");
		System.out.print(" { ");
		for(int index=0;index<answer.length;index++) {
			if(index==answer.length-1)
				System.out.print(answer[index]);
			else
				System.out.print(answer[index]+" , ");
		}
		System.out.println(" }");

	}

}
