package sandesh.coding_exam_1;

public class SumOfIntegersFromString {

	int num;
	int sumNum;
	void getAddition(String inCombo) {
		num = Integer.parseInt(inCombo);
		//System.out.println(num);
		sumNum += num;
		System.out.println(sumNum);
	}
	
	void getEachInt(String inStr) {
		int innerIndex = 0;
		int index = 0;
		do {
			String combo = "";
			for(index=innerIndex; index<inStr.length(); index++) {
				if(inStr.charAt(index) >= 48 && inStr.charAt(index) <= 57)
					combo += inStr.charAt(index);
				else
					break;
			}
			innerIndex = index+1;
			getAddition(combo);
		}while(index < inStr.length()+1);
			//getAddition(combo);
			
	}
	
	public static void main(String[] args) {
		String str = "12h14i4w8sdc15";
		new SumOfIntegersFromString().getEachInt(str);
	}
}
