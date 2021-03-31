//WAP to compute simple Interest
//SI = (P*T*R)/100 , where P = Principle amount, T = Time(Year), R = Rate
package sangeeta;
class simpleInterest{
	
	void SI(int P,int T,int R){
		double Answer = (double)(P*T*R)/100; // where P = Principle Amount, 
		System.out.println(" Simple Interest is "+Answer);
	}
	
	public static void main(String[] a){
		simpleInterest simpleInterest = new simpleInterest();
		simpleInterest.SI(4,6,8);
	}
}
