package sai.codingexam18;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Employee> empAL = new ArrayList<Employee>();
		empAL.add(new Employee(1, "Sai", "Pune"));
		empAL.add(new Employee(3, "Krishna", "Hyderabad"));
		empAL.add(new Employee(2, "NK", "Mumbai"));
		empAL.add(new Employee(0, "Walter", "Sunny"));
		
		Collections.sort(empAL);
		System.out.println(empAL);
	}
}