package sai.codingexam18;

import java.util.HashSet;

public class UniqueData {

	public static void main(String[] args) {
		HashSet<Employee1> empHS = new HashSet<Employee1>();

		empHS.add(new Employee1(1, "SunnyBoy", "Pune"));
		empHS.add(new Employee1(3, "Credits", "Hyd"));
		empHS.add(new Employee1(2, "Automation", "Mumbai"));
		empHS.add(new Employee1(0, "Selenium", "Sunny"));
		empHS.add(new Employee1(1, "SunnyBoy", "Pune"));
		empHS.add(new Employee1(3, "Credits1", "Pune"));

		System.out.println(empHS);
	}
}