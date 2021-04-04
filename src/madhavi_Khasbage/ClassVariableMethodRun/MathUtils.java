package madhavi_Khasbage.ClassVariableMethodRun;

class MathUtils
{
	void square(int num1){
		System.out.println("Square =" + num1*num1);
	}
	
	void cube(int num2){
		System.out.println("Cube =" + num2*num2*num2);
	}
	
	public static void main(String[] agrs){
		MathUtils objMathUtils =new MathUtils();
		objMathUtils.square(24);
		objMathUtils.cube(45);
	}	
}