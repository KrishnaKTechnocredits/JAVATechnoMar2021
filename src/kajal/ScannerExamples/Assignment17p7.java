//Miniumum number in given array
package kajal.ScannerExamples;

public class Assignment17p7 {
	
		void findMax(int[] num) {
			int minNum = num[0];
			for(int index=1; index<num.length; index++) {
				if(num[index] < minNum)
					minNum = num[index];
			}
			System.out.println("Max number in given array is :"+minNum);
		}
		public static void main(String[] args) {
			Assignment17p7 max = new Assignment17p7();
			int[] num = {22,35,65,88,11,23,45};
			max.findMax(num);
		}
		
}
