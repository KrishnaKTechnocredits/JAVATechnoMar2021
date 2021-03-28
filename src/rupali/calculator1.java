//Assignment 2

package rupali;
class calculator1 {
	int x= 10;
	int y=20;
	int ans;
	
	void add() {
			ans=x+y;
			System.out.println("Addition of number = " +ans);
	}
	
	void sub() {
			ans=x-y;
			System.out.println("Addition of number = " +ans);
	}
	
	public static void main(String[] args){
		calculator1 Calc1= new calculator1();
		Calc1.add();
		Calc1.sub();
	}
}