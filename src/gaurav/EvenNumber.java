package gaurav;

public class EvenNumber {
	void even(int start,int end) {
		for (int i = start; i <= end; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumber EvenNumber1 = new EvenNumber();
		EvenNumber1.even(10,15);
	}
}
