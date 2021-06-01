package shashank.assignment_31;

public class SwapWithoutTemp {
	void swap(int x, int y) {
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("Swapped numbers are x = " + x + " and y = " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapTemp swap = new SwapTemp();
		int x = 100, y = 208;
		System.out.println("Given numbers for swaaping x = " + x + " and Y = " + y);
		swap.swap(x, y);

	}
}
