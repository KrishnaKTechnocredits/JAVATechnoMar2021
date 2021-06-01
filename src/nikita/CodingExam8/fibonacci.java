package nikita.CodingExam8;

public class fibonacci {

	int temp;
	int firstnumber=0;
	int secondnumber=1;
	
	void fibonaccinumb(int n) {
		
		for(int index=2; index<8; index++){
			temp=firstnumber+secondnumber;
			System.out.println(firstnumber + " ");
			firstnumber=secondnumber;
			secondnumber=temp;
			
		}
		System.out.println("The fibonacci numbers upto 8 is: "+temp);
	}
	
	public static void main(String[] args) {
		fibonacci f=new fibonacci();
		f.fibonaccinumb(8);
	}
}
