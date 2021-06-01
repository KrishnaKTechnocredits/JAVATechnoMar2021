/*Program 9:  return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2
*/

package sourabh.arrayExample;

public class FindMaxIndex {
	int getMaximumIndexOfString(String[] str) {
		int maxIndex=0;
		for(int index=0; index<str.length; index++) {
			if(str[maxIndex].length()<str[index].length()) {
				maxIndex=index;
			}
		}
		return maxIndex;
	}
	public static void main(String[] args) {
		FindMaxIndex findMaxIndex= new FindMaxIndex();
		String[] str= {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		int maxIndex= findMaxIndex.getMaximumIndexOfString(str);
		System.out.println("MaxIndex: "+maxIndex);
	}
}
