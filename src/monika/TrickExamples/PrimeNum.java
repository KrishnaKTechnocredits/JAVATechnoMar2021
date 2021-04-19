package monika.TrickExamples;

public class PrimeNum {
	
	void validatePrimeNumOrNot(int targetNum){
		int num=2;
		for(;num<targetNum;num++) {
			if(targetNum%num == 0)
				break;
		}
		if(targetNum == num)
			System.out.println(+targetNum+" no. is prime");
		else
			System.out.println(+targetNum+" no is not prime");
	}
	
	void validatePrimeNumOrNot1(int targetNum){
		int num=2;
		for(;num<targetNum/2;num++) { //num <4
			if(targetNum % num == 0) //num= 2, targetnum = 9
				break;
		}
		if(targetNum/2 == num) //num = 3, targetnum/2 = 4
			System.out.println(+targetNum+" no. is prime");
		else
			System.out.println(+targetNum+" no is not prime");
	}

	public static void main(String[] args) {
		PrimeNum obj = new PrimeNum();
		obj.validatePrimeNumOrNot(1);
		
		obj.validatePrimeNumOrNot1(9);

	}

}
