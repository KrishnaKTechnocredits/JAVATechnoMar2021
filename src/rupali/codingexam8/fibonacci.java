package rupali.codingexam8;

public class fibonacci {
	
	void fibonacciseries(int num) {
		int a=0,b=1,c;
		for(int index=0;index<num;index++) {
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
	}
	public static void main(String[] args) {
		fibonacci fb=new fibonacci();
		int num=8;
		fb.fibonacciseries(num);
	}

}
