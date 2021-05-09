package renuka.exam2;

public class SumOfAllTheIntegerFromString {
	
	int getSumFromString(String str) {
		int sum = 0;
		int digitCount = 0;
		for(int index = 0; index < str.length(); index++) {
			if(Character.isDigit(str.charAt(index))) {
				digitCount = index;
				while (index < str.length() - 1 && Character.isDigit(str.charAt(index + 1))) {
					index++;
				}
				String str1 = str.substring(digitCount, index+1);
			    sum = sum + Integer.valueOf	(str1);	
			}
		}
	    //System.out.println(sum);
		return sum;
	}

	public static void main(String[] args) {
		SumOfAllTheIntegerFromString sumOfIntegerFromString = new SumOfAllTheIntegerFromString();
		String str = "12h14i4w8sdc15";
		int sum = sumOfIntegerFromString.getSumFromString(str);
		System.out.println("Sum of All Integer from string "+str+" is: " + sum);

	}

}
