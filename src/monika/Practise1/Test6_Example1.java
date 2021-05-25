package monika.Practise1;

public class Test6_Example1 {
	
	int getFreq(String input, char ch) {
		for(int index=0;index<input.length();index++) {
			int count = 0;
			for(int innerindex=0;innerindex<input.length();innerindex++) {
				if(input.charAt(index) == input.charAt(innerindex))
					count++;
			}
		}
	}
}