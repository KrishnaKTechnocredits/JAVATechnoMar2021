package rahul_Hiremath;

class Ass_2_1
{
	void square(int squareValue){
		int ans = squareValue * squareValue;
		System.out.println("Square is: " + ans);
	}
	void cube(int cubeValue){
		int ans = cubeValue * cubeValue * cubeValue;
		System.out.println("Cube is: " + ans);
	}
	public static void main (String[] args){
		Ass_2_1 sqcb = new Ass_2_1();
		sqcb.square(3);
		sqcb.cube(2);
	}
}