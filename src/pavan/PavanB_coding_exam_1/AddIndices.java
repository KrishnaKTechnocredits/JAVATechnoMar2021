package pavan.PavanB_coding_exam_1;

import java.util.Arrays;

public class AddIndices {
	
	void getSumIndices(int[]input, int target){

		int[]result= new int[2];


		for(int index=0; index<input.length;index++) {
			for (int innerindex=1;innerindex<input.length;innerindex++) {
				if((input[index]+input[innerindex])==target) {

					result[0]= index;
					result[1]=innerindex;	
				} 			
			}	
		}System.out.println (Arrays.toString(result));
	}

	public static void main(String[] args) {
		int[]input= {2,11,15,7,4};
		int target=9;
		AddIndices addIndices= new AddIndices();
		addIndices.getSumIndices(input,target);

	}
}
