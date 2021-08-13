package amrutaM.javaBasics;

/*Program 1: Find weekdays or weekend based on dayIndex.
1 -> Monday
2 -> Tuesday
7 -> Sunday

dayIndex -> 3 : Weekday
dayIndex -> 6 : WeekEnd
dayIndex -> 11 : Invalid Index
dayIndex -> -3 : Invalid Index
*/
public class Assignment3_Program1 {

	void getDay(int dayIndex) {
		if (dayIndex == 1)
			System.out.println("Weekday");
		else if (dayIndex == 2)
			System.out.println("Weekday");
		else if (dayIndex == 3)
			System.out.println("Weekday");
		else if (dayIndex == 4)
			System.out.println("Weekday");
		else if (dayIndex == 5)
			System.out.println("Weekday");
		else if (dayIndex == 6)
			System.out.println("WeekEnd");
		else if (dayIndex == 7)
			System.out.println("WeekEnd");
		else if (dayIndex < 0 || dayIndex > 7)
			System.out.println("Invalid index");
	}

	public static void main(String[] args) {
		Assignment3_Program1 assignment3_Program1 = new Assignment3_Program1();
		assignment3_Program1.getDay(3);
		assignment3_Program1.getDay(6);
		assignment3_Program1.getDay(-3);
		assignment3_Program1.getDay(11);
	}
}
