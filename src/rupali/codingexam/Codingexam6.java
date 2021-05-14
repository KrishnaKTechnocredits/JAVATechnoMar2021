package rupali.codingexam;


class Codingexam6{
	char charwithmaxfreq(String input){
		int temp=0,largest=0;
		char output=' ';
		for(int i=0;i<input.length();i++){
			for(int j=0;j<input.length();j++) {
				if(input.charAt(i)==input.charAt(j)) {
					temp++;
				}
			}
			if(largest<temp){
				largest=temp;
				output=input.charAt(i);
			}
			temp=0;
		}
		return output;
	}
	public static void main(String[] args){
		Codingexam6 codingexam6=new Codingexam6();
		String input="globant india is hiring";
		System.out.println("Input: "+input);
		char output=codingexam6.charwithmaxfreq(input);
		System.out.println("The most repeating character in above input string is "+output);
	}
}