package monali;

class Conversion{
	
	void convert(int num){
		int ans = (num=32)*5/9;
		System.out.println("Temperature in celsius is" +ans);
	}
	
	public static void main(String[] a){
		Conversion conversion = new Conversion();
		conversion.convert(40);
	}
}