package technocredits;

class Example5{	
	int x = 10;
	int y = 20;
	
	void updateData(){
		x = x + 10;
		y = y - 5;
	}
	
	void showData(){
		System.out.println("Value of x is " + x);
		System.out.println("Value of y is " + y);
	}
	
	public static void main(String[] args){
		Example5 example5 = new Example5();
		example5.updateData();
		example5.showData();
		
		Example5 example5_1 = new Example5();
		example5_1.showData();
	}
}

//20 15 20 15
//20 15 10 