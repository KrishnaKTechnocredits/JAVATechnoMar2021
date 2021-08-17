package amrutaM.arrayAssignments;

/*program 2 : 
return middle char of all elements of the String array. 
String[] str = {"hello","techno","credits"}; char charAt(int index){ }  
Hint : charAt method of String class helps to retrieve character on given index
*/
public class Assignment15Program2 {

	char[] getMiddleChar(String[] str) {
		int middleIndex = 0;
		char[] output = new char[str.length];
		for (int index = 0; index < str.length; index++) {
			if (str[index].length() % 2 == 0) {
				middleIndex = str[index].length() / 2 - 1;
				output[index] = str[index].charAt(middleIndex);
			} else if (str[index].length() % 2 != 0) {
				middleIndex = str[index].length() / 2;
				output[index] = str[index].charAt(middleIndex);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String[] str = { "hello", "techno", "credits" };
		Assignment15Program2 assignment15Program2 = new Assignment15Program2();
		char[] ans = assignment15Program2.getMiddleChar(str);
		for(int index=0;index<ans.length;index++) {
			System.out.println(ans[index]);
		}
	}
}
