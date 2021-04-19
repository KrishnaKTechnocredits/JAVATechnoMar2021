package technocredits;

public class SwitchcaseExample1 {

	void ifElseLadderEx(int dayIndex) {
		if (dayIndex == 1) {
			System.out.println("Monday");
		} else if (dayIndex == 2) {
			System.out.println("Tuesday");
		} else if (dayIndex == 3) {
			System.out.println("Wed");
		} else if (dayIndex == 4) {
			System.out.println("Thr");
		} else if (dayIndex == 5) {
			System.out.println("Fri");
		} else if (dayIndex == 6) {
			System.out.println("Sat");
		} else if (dayIndex == 7 || dayIndex == 8) {
			System.out.println("Sunday");
		} else {
			System.out.println("Invalid day index");
		}
	}

	void switchCaseEx(int dayIndex) {

		switch (dayIndex) {
		default:
			System.out.println("Invalid day Index");
			break;
		case 5:
			System.out.println("fri");
			break;
		case 6:
			System.out.println("sat");
			break;
		case 7:
			System.out.println("sun");
			break;
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("wed");
			break;
		case 4:
			System.out.println("thr");
			break;

		}

		/*
		 * String operation = "debit";
		 * 
		 * switch(operation) { case "debit":
		 * System.out.println("User choose debit option"); case "credit":
		 * System.out.println("User choose debit option"); default :
		 * System.out.println("Invalid operation"); }
		 */
	}

	public void m1(char ch) {
		ch = Character.toUpperCase(ch);
		switch(ch) {
			case 'A':
			case 'a':
				System.out.println("a is a vowel");
				break;
				
				
		}
	}
	
	/*public void operation(String op, int amt) {
		switch(op) {
			case "debit":
				if(balance >= amt)
					balance = balance - amt;
				else
					System.out.println("Insufficent fund");
				break;
			case "credit":
				
		}
	}*/
	
	public static void main(String[] args) {
		SwitchcaseExample1 switchcaseExample1 = new SwitchcaseExample1();
		switchcaseExample1.switchCaseEx(8);
	}
}
