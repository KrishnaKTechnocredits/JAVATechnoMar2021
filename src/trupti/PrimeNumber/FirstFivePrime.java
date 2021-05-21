package trupti.PrimeNumber;

public class FirstFivePrime {

	void getFirstFivePrime() {
		PrimeNumbers primenumbers=new PrimeNumbers();
		int count=0;
		boolean ans;
		System.out.println("First five prime numbers in given range 10 to 50 are :");
		for(int index=10;index<=50;index++) {
			ans=primenumbers.isPrimeNumber(index);
			if(ans==true) { 
				count++;
				System.out.println(index);
			}
			if(count==5)
				break;
		}
	}

	public static void main(String[] args) {
		FirstFivePrime firstfiveprime=new FirstFivePrime();
		firstfiveprime.getFirstFivePrime();

	}

}
