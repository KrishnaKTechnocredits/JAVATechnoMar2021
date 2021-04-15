package siddhant.Assignment18;

public class Asccivalue{
	int getascci(char ch){
		return ch;
	}
	public static void main(String[]args){
		Asccivalue av = new Asccivalue();
		System.out.println("--------------------------------Ascii value of Alphabets from A to Z-------------------");
		
		for(char charA = 'A' ; charA<= 'Z' ; charA++){
			int value = av.getascci(charA);
			System.out.println("The ascci value for " +charA+ " is :" +value);
		}
	}
}