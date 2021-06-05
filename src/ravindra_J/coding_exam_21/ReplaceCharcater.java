/*Test - 21 : 4th Jun'2021
String str1="This is the thread that given"
String str2="th"
Expected Output : hTis is hte htread htat given
 */
package ravindra_J.coding_exam_21;
class ReplaceCharcater{

	static String replaceChar(String str,String replaceChar){

		String[] stringArr = str.split(" ");
		//List<String> list = new ArrayList<String>(Arrays.asList(stringArr));
		String output = "";
		for(String word: stringArr){

			if(word.contains("Th")) {
				word = word.replace("Th", "hT");

			}
			else if(word.contains(replaceChar)) {
				word = word.replace(replaceChar,"ht");
			}
			output = output + word + " ";
		}
		return output;
	}
	
	public static void main(String args[]){
		String input = "This is the thread that given";
		String replacement = "th";
		String expectedOutput = replaceChar(input,replacement);
		System.out.println("Actual Input : "+input+"\nExpected Output : "+expectedOutput);
	}


}