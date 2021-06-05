package rupali.codingexam.exam19;

public class Pattern2 {
	public static void main(String[] args) {
		String 	str="GLOBANT";
		for(int i=str.length();i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(str.charAt(j));
			}
			System.out.println();
		}
	}


}
