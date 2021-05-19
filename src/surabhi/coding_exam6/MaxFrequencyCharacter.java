
package surabhi.coding_exam6;

public class MaxFrequencyCharacter {
	char getMaxFrequencyChar(String str){
		str=str.toLowerCase();
		char ch=' ';
		char[] arr=str.toCharArray();
		int max=0, count=0;
		for(int index1=0;index1<arr.length;index1++){
			for(int index2=0;index2<str.length();index2++){
				if(str.charAt(index2)==arr[index1]&& ch!=arr[index1]){
					count++;
				}
			}
			if(max<count){
				max=count;
				count=0;
				ch=arr[index1];
			}
			
		}
		return ch;	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxFrequencyCharacter maxFrequencyCharacter=new MaxFrequencyCharacter();
		String str="globant India is hiring";
		char ch=maxFrequencyCharacter.getMaxFrequencyChar(str);
		System.out.println(ch);  
	}	

}
