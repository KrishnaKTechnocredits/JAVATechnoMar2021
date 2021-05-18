package shashank.assignment_31;

public class SwapTemp {
	void swap(int x, int y) {
		int temp;
		temp = x;
		x = y;
		y = temp;
		System.out.println("Swapped numbers are x = " + x + " and y = " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTemp swap = new SwapTemp();
		int x = 10, y = 20;
		System.out.println("Given numbers for swaaping x = " + x + " and Y = " + y);
		swap.swap(x, y);

	}

}
