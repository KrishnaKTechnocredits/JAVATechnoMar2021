//Maximum number is give array
package kajal.ScannerExamples;

public class Assignment17p6 {
	
		void findMax(int[] num) {
			int maxNum = num[0];
			for(int index=1; index<num.length; index++) {
				if(num[index] > maxNum)
					maxNum = num[index];
			}
			System.out.println("Max number in given array is :"+maxNum);
		}
		public static void main(String[] args) {
			Assignment17p6 max = new Assignment17p6();
			int[] num = {22,35,65,88,11,23,45};
			max.findMax(num);
		}
		
}
