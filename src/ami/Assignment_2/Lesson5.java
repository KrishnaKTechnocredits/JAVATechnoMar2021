package ami.Assignment_2;
//convert temperature fahrenheit to celsius.

class Lesson5{
	void cel(double f){
		double C = ( f - 32 )*5 / 9;
		System.out.println("celsius : " + C);
	}
	
	public static void main(String[] a){
		Lesson5 lesson5 = new Lesson5();
		lesson5.cel(40.5);
	}
}