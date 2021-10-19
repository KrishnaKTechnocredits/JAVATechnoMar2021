package amrutaM.Assignment33;
/*program 4 : find the triple which in sequence and having maximum sum

input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
iteration : 3,4,5
         9,10,11
		 10,11,12
         1,2,3
output : 10,11,12
Time Taken =20 mins
*/
public class P4TripletWithMaxSum {

	void getTripletWithMaxSum(int []input) {
		int sum = 0;
		int maxSum = 0;
		for(int index=0; index<input.length-2;index++) {
			int num = input[index];
			if(num+1==input[index+1]&& num+2==input[index+2]) {
				sum = num+input[index+1]+input[index+2];
				if(sum>maxSum) {
					maxSum=sum;
					sum=maxSum;
				}
			}
		}
		System.out.println("Triplet with max sum is "+maxSum);
	}
	public static void main(String[] args) {
		int [] input = {1,3,4,5,7,3,9,10,11,12,44,67,1,2,3,99};
		new P4TripletWithMaxSum().getTripletWithMaxSum(input);
	}
}
