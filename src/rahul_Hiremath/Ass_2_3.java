package rahul_Hiremath;

class Ass_2_3
{
	void calSimpleIntrest(int p, int t, int r){
		int intrest = (p * t * r)/100;
		System.out.println("Intrest is: " + intrest);
	}
	public static void main(String[] args){
		Ass_2_3 intrest = new Ass_2_3();
		intrest.calSimpleIntrest(200, 3, 7);
	}
}