package surabhi.coding_exam19;

public class PatternEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="GLOBANT";
		for(int index=0;index<str.length();index++) {
			for(int innerIndex=0;innerIndex<index+1;innerIndex++) {
				System.out.print(str.charAt(innerIndex)+" ");
			}
			System.out.println();
		}
	}

}
