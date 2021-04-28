package surabhi.assignment25;

public class StringNumericOperation {
	
	String[] findNumericString(String[] str) {
		String[] result=new String[str.length];
		int count=0;
		for(int index=0; index<str.length;index++) {
			for(int innerIndex=0; innerIndex<str[index].length(); innerIndex++) {
				if(Character.isDigit(str[index].charAt(innerIndex))) {
					if(count<result.length) {
					result[count]=str[index];
					count++;
					break;
					}
				}
			}	
		}
		return result;
	}
	
	public static void main(String[] args) {
		StringNumericOperation stringNumericOperation=new StringNumericOperation();
		String[] str= {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"};
		String[] result=new String[str.length];
		result=stringNumericOperation.findNumericString(str);
		for(int index=0;index<result.length;index++) {
			if(result[index]!=null)
			System.out.println(result[index]);
		}

	}

}
