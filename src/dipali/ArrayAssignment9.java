package dipali;

public class ArrayAssignment9 {
	
	public void verifyMaxlenIndexFromArray(String[] input) {
		String Name;
		int index=0;
		int templen=0;
		int len=0;
		int maxLen=0;
		String tempName=null;
		if(!(input == null)) {
			int arrLen=input.length;
			for(int cnt=0;cnt<arrLen;cnt++) {
				Name = input[cnt];
				len = Name.length();
				if((len >0) && (len >maxLen)) {
					index=cnt;
					tempName=Name;
					templen = tempName.length();
					maxLen = templen;
				}
			}
			System.out.println("This string  ["+tempName+"] is having maximum len and its index is ["+index+"] ");
		}
	}
	public static void main(String[] args) {
		String[] arr= {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		new ArrayAssignment9().verifyMaxlenIndexFromArray(arr);
	}
}
