package sandesh.OWN_Practice_Sandesh_1;

public class SumOfIntegersFromString {
	
	int num, sumNum;
	int getAddition(String inCombo) {
		//System.out.println(inCombo);
		if(inCombo.equals("")) {
			num=0;
			sumNum += num;
		}
		else {
			num = Integer.parseInt(inCombo);
			sumNum += num;
		}
		//System.out.println(sumNum);
		return sumNum;
	}
	
	int getEachInt(String inStr) {
		String combo = "";
		int sumTotal = 0;
		for(int index = 0; index<inStr.length(); index++) {
			if(Character.isDigit(inStr.charAt(index)))
				combo += inStr.charAt(index);
			if(index == (inStr.length()-1) || Character.isLetter(inStr.charAt(index))) {
				sumTotal = getAddition(combo);
				combo = "";
			}
		}
		return sumTotal;
	}
	
	public static void main(String[] args) {
		String str = "12h14i4w8sdc15";
		int totalSum = new SumOfIntegersFromString().getEachInt(str);
		System.out.println("Sum is -: " + totalSum);
	}
}
