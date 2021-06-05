package rupali.codingexam.exam21;

public class Stringoperation {
	public static void main(String[] args) {
		String str1="This is the thread that given";
		String str2="th";
		 if(str1.contains(str2))	{
				str1=str1.replace("th","ht");
			}
			if(str1.contains("Th"))
				str1=str1.replace("Th","hT");
		
		System.out.print(str1);
	}
}
