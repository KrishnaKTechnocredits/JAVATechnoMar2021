package surabhi.coding_exam21;

public class StringReplaceCharSequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="This is the thread that given";
		System.out.println("original String :\n" +str1);
		String str2="th";
		while(str1.toLowerCase().contains(str2)) {
			int i1=str1.toLowerCase().indexOf(str2);
			String temp=""+str1.charAt(i1+1)+str1.charAt(i1);
			str1=str1.replaceAll((str1.substring(i1, i1+2)), temp);
		}
		System.out.println("String after replace HT with TH :\n"+str1);
	}

}
