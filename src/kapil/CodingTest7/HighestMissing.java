package kapil.CodingTest7;

public class HighestMissing {

	void getHighestMissingInt(int[] array) {

		{

			int MaxNum =array[0];
			for (int number = 1; number <= 10; number++) {
				boolean isNumPresent = false;
				for (int index = 0; index < array.length; index++)
					if (number == array[index]) {
						isNumPresent = true;
						break;
					}
			if (isNumPresent == false)
				if(number>MaxNum)
					MaxNum=number;

			
		}
			System.out.println("Maximum Num " + MaxNum);
		}
	}

	public static void main(String[] args) {
		HighestMissing highestmissing = new HighestMissing();
		int[] array = { 1, 3, 4, 7, 9, 10 };
		highestmissing.getHighestMissingInt(array);
	}

}
