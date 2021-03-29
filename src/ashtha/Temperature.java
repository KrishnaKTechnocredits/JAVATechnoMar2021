package ashtha;

class TempConversionConversion {

	void conversion (double F){
		double celsius = (F-32)*5/9;
		System.out.println("The celsius conversion is "+celsius);
	}
	
	public static void main (String[] a){
		TempConversionConversion tempConversion = new TempConversionConversion();
		tempConversion.conversion(99.8);
	}
}
		