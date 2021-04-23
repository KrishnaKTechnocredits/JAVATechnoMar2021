package amruta.Assignment_18;

public class ConvertChartoInt {
	
	void AddofAscii() {
		char ch = '2';
		int sum = 10;
				
		sum = sum + Character.getNumericValue(ch); // Converted Char to integer '1' to 1
		System.out.println("Sum = "+sum);	
		
	}

	public static void main(String[] args){
		
		ConvertChartoInt value = new ConvertChartoInt();
		value.AddofAscii();
		
	}
}
