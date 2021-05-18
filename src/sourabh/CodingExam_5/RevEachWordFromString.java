/*Test - 5 [ Medium Complexity] : 13th May'2021 

Write a java program to reverse each word of a given string

input : hi hello how are you

output : ih olleh woh era uoy
*/
package sourabh.CodingExam_5;

public class RevEachWordFromString {
	void getRevWordString(String strInput){
		String[] strArr= strInput.split(" ");
		for(int index=0; index<strArr.length; index++) {
		StringBuffer sb1= new StringBuffer(strArr[index]);
		sb1.reverse();
		System.out.println(sb1);
		}	
	}
	public static void main(String[] args) {
		RevEachWordFromString revEachWordFromString= new RevEachWordFromString();
		revEachWordFromString.getRevWordString("hi hello how are you");
	}
}
