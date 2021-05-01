package prachi.Assignment_17;

/*Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4*/

public class ArrPosNegCount {
	int getCount(int[] numberArr) {
		int posCnt = 0;

		for(int index = 0;index < numberArr.length;index++) {	
			if(numberArr[index]>0)
				posCnt++;
		}	
		return posCnt;			
	}

	public static void main(String[] args) {
		int[] numberArr = {10,23,26,-27,-88,87,-65};
		ArrPosNegCount posNegNum= new ArrPosNegCount();
		int posCount = posNegNum.getCount(numberArr);
		System.out.println("Positive number Count: "+posCount);
		System.out.println("Negative number Count: "+(numberArr.length - posCount));
	}
}
