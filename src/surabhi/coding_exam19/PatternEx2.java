package surabhi.coding_exam19;

public class PatternEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="GLOBANT";
		for(int index=0;index<str.length();index++) {
			for(int innerIndex=0;innerIndex<str.length()-index;innerIndex++) {
				System.out.print(str.charAt(innerIndex)+" ");
			}
			System.out.println();
		}
	}

}
