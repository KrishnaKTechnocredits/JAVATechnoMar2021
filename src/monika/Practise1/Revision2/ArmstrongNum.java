package monika.Practise1.Revision2;

public class ArmstrongNum {
	
	void isArmStrongNum(int inputNum) {
		int resultNum = 0;
		int temp = inputNum;
		while(temp > 0) {
			int mod = temp % 10;
			resultNum += (mod*mod*mod);
			temp = temp / 10;
		}System.out.println(resultNum);
		if(resultNum == inputNum)
			System.out.println("No is armStromg");
		else
			System.out.println("No is not armstrong");
		
		
	}

	public static void main(String[] args) {
		ArmstrongNum obj = new ArmstrongNum();
		obj.isArmStrongNum(153);
		// 1*1*1 + 5*5*5 + 3*3*3
	}

}
