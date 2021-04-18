package dipali;

public class Assignment20P2 {
	
	public void getSumOfAllGivenNumbersFromCharacters(String input) {
		int val=0;
		if(input!=null) {
			char[] ch=input.toCharArray();
			int count=0;
			for (char chara : ch) {
				if(Character.isDigit(chara)) {
					 val = Integer.parseInt(String.valueOf(chara));
					count=count+val;
				}
		}
			System.out.println("sum of all characters number is "+count);
	}
		
	}
	public static void main(String[] args) {
		new Assignment20P2().getSumOfAllGivenNumbersFromCharacters("J7yu9y8h1h8j4b7j3jjb6");
	}

}
