package mayur.codingexam1;

public class ArrayAddition {
	int[] getSum(int[] num, int target) {
		for (int index = 0; index < num.length; index++) {
    		for (int innerindex = index + 1; innerindex < num.length; innerindex++) {
    			if (num[index] + num[innerindex] == target) {
    				return new int[] { index, innerindex };
    			}
    		}
    	}

    	return new int[] {};
	}

    public static void main(String[] args) {
    	int[] nums = {2,11,15,7,4};
    	ArrayAddition array = new ArrayAddition();
    	int[] indices = array.getSum(nums, 9);

    	 if (indices.length == 2) {
    		 System.out.println(indices[0] + " " + indices[1]);
    	 } else {
             System.out.println("No Data found");
    	 }
    }
}
