package monika.Practise2;

public class Calling{
	
	Calling(){
		
	}
	
	
	String getOutput(String[] input) {
	String s ="";
	String d = "_";
	for(int i=0;i<input.length;i++){
		s = input[i];
		if(i<input.length-1)
		s+=d;
	}
	return s;
}

	public static void main(String[] args) {
		
		Calling c = new Calling();
		String[] input = {"Hello","Hi","Techno"};
		String s = "";
		s = c.getOutput(input);
		System.out.println(s);
	}
	
}
