package surabhi.assignment25;

public class PrimeFromRange {
	boolean isPrime(int num) {
		boolean isPrime=true;
		for(int index=2; index<=num/2; index++) {
			if(num%index==0) {
				isPrime=false;
				break;
			}
		}	
		return isPrime;
	}
	int[] findPrime(int start, int end) {
		int[] num=new int[5]; int count=0;
		boolean isPrime=true;
		for(int index=start; index<=end;index++) {
			isPrime=isPrime(index);
			if(isPrime) {
				if(count<5) {
					num[count]=index;
					count++;
				}
			}
		}
		return num;
		
	}

	public static void main(String[] args) {
		PrimeFromRange primeFromRange=new PrimeFromRange();
		int [] arr=new int[5];
		arr=primeFromRange.findPrime(10, 50);
		for(int index=0;index<arr.length;index++) {
			System.out.print(arr[index]+" ");
		}
		

	}

}
