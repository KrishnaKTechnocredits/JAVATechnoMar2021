package monika.Practise2;
import monika.Practise1.VisibilityPurposeClass;


public class Calling extends VisibilityPurposeClass {
		
	Calling(){
		System.out.println("default child class constructor");
	}
	/*String getOutput(String[] input) {
	String s ="";
	String d = "_";
	for(int i=0;i<input.length;i++){
		s = s + d + input[i];
	}
	return s.substring(1);
}*/
	public static void main(String[] args) {
		Calling c = new Calling();
		/*String[] input = {"Hello","Hi","Techno"};
		String s = c.getOutput(input);
		System.out.println(s);*/
/*		Manager manager = new Manager(100); //100*/
	}
	
}
