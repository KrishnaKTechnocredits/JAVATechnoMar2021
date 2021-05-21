package monika.Practise1.Ass14;
/*Program 9: return the index having maximum length from given string array.
input : {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
output : 2*/
public class Test1 {

	int getIndexOfMaxStringInArray() {
		String[] arr = {"Monika","Sonika","Shakti","Ashok","Gagan","Janmanman"};
		int temp = arr[0].length(), resultIndex = 0;
		for(int index=1;index<arr.length;index++) {
			if(temp < arr[index].length()) {
				temp = arr[index].length();
				resultIndex = index;
			}	
		}
		return resultIndex;
	}
	
	public static void main(String[] args) {
		Test1 obj = new Test1();
		int x = obj.getIndexOfMaxStringInArray();
		System.out.println(x);
	}
	
}
