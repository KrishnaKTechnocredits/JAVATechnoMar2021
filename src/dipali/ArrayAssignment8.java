package dipali;

public class ArrayAssignment8 {
	public void verifyMaxlenNameFromArray(String[] input) {
		String Name;
		String tempName=null;
		int templen=0;
		int len=0;
		int maxLen=0;
		if(!(input == null)) {
			int arrLen=input.length;
			for(int cnt=0;cnt<arrLen;cnt++) {
				Name = input[cnt];
				len = Name.length();
				if((len >0) && (len >maxLen)) {
					tempName=Name;
					templen = tempName.length();
					maxLen = templen;
				}
			}
			System.out.println("This string Name ["+tempName+"] is having maximum len");
		}
	}
	public static void main(String[] args) {
		String[] arr= {"Maulik", "Krishna", "Technocredits", "Kangan", "Harsh"};
		new ArrayAssignment8().verifyMaxlenNameFromArray(arr);
	}
}
