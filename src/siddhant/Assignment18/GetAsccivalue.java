package siddhant.Assignment18;

public class GetAsccivalue{
	
	char getchar(int Asciivalue){
		return (char)Asciivalue;
	}
	
	public static void main(String[]args){
		GetAsccivalue get = new GetAsccivalue();
		
		System.out.println("--------------------------Characters for given Asccivalues are-----------------------");
		
		for(int i = 97 ; i <= 122 ; i++){
			char Returnchar = get.getchar(i);
			System.out.println("The character for given ascci value - " +i+ " is : " +Returnchar);
		}
	}
}
