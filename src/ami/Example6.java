package ami;

class Example6{
	 static int x = 10;
	 int y= 20;
	 
	 void updateData(){
		x = x + 10;
		y = y - 5;
	 }

	void showData(){
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		}
		
	public static void main(String[] a){
		Example6 example6 = new Example6();
		example6.updateData();
		example6.showData();
		
		Example6 example6_1 = new Example6();
		example6_1.showData();
	}
		
}