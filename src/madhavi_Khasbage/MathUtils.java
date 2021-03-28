package madhavi_Khasbage;

class MathUtils
{
	void Square(int num1){
		System.out.println("Square =" + num1*num1);
	}
	
	void Cube(int num2){
		System.out.println("Cube =" + num2*num2*num2);
	}
	
	public static void main(String[] agrs){
		MathUtils objMathUtils =new MathUtils();
		objMathUtils.Square(24);
		objMathUtils.Cube(45);
	}	
}