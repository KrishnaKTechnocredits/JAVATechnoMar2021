package monali.coding_exam_8_30mins;

public class UniqueNumber {

	int uniqueElement(int arr[]) {
		int length = arr.length;
		int num = 1;
		for (int index = 0; index < arr.length; index++) {
			int i = 0;
			for (i = 0; i < index; i++)
				if (arr[index] == arr[i])
					break;

			if (index == i)
				num++;
			System.out.println(arr[index] + " ");
		}
		return num;

	}

	public static void main(String[] args) {
		UniqueNumber q1 = new UniqueNumber();
		int arr[] = { 10, 2, 3, 10, 3, 55, 61, 2 };
		q1.uniqueElement(arr);
	}
}
