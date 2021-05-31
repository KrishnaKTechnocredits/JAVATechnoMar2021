/*codingexam 14
2. Return all the words having more than two vowels from given array.
input: ["aashay","sandesh","madhavi","ankit","ami","priyanka"]
output: ["aashay","madhavi","priyanka"]

public ArrayList<String> getVowels(String words[]){
	//write your logic
}
*/
package rupali.codingexam;



import java.util.ArrayList;

public class Stringwithmorethan2vowels {
	public ArrayList<String> getVowels(String words[]){
		ArrayList<String> output=new ArrayList<String>();
		for(int index=0;index<words.length;index++) {
			int count=0;
			for(int innerindex=0;innerindex<words[index].length();innerindex++) {
				if(words[index].charAt(innerindex)== 'a' || words[index].charAt(innerindex)=='e' ||words[index].charAt(innerindex)=='i' ||words[index].charAt(innerindex)=='o' || words[index].charAt(innerindex)=='u') {
					count++;
				}
				if(count>2) {
					output.add(words[index]);
					break;
				}
			}
			
		}
		return output;
	}

	public static void main(String[] args) {
		Stringwithmorethan2vowels stringwithmorethan2vowels=new Stringwithmorethan2vowels();
		String[] input= {"aashay","sandesh","madhavi","ankit","ami","priyanka"};
		ArrayList<String> output= stringwithmorethan2vowels.getVowels(input);
		System.out.println(output);
	}

}
