package technocredits.collectionDemo.comparableDemo;

import java.util.ArrayList;
import java.util.Collections;

public class Client {

	public static void main(String[] args) {
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
		Employee e1 = new Employee(101, "Sandesh", 180000);
		Employee e2 = new Employee(102, "Vishal", 80000);
		Employee e3 = new Employee(103, "Vishnu", 12000);
		Employee e4 = new Employee(104, "Krati", 32000);
		
		listOfEmployees.add(e1);  
		listOfEmployees.add(e2);
		listOfEmployees.add(e3);
		listOfEmployees.add(e4);
		
		Collections.sort(listOfEmployees); //e2.compareTo(e1), e3.compareTo(e2)
		System.out.println(listOfEmployees);
		
		//5, 3, 2 --> 5 & 3, 3 & 2
		//5, 3, 4 --> 5 & 3, 3 & 4, 4 & 5
		
		/*Collections.reverse(listOfEmployees);
		System.out.println(listOfEmployees);*/
		
		/*TreeSet<StringBuffer> ts = new TreeSet<StringBuffer>();
		ts.add(new StringBuffer("Hi"));
		ts.add(new StringBuffer("Hello"));
		
		//System.out.println(ts);
*/	}
}
