package technocredits.collectionDemo.impExamples;

import java.util.HashSet;

public class Example1 {

	 public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("Maulik");
		hs.add("KRishna");
		hs.add("Maulik");
		
		
		System.out.println(hs.size()); // 2
		HashSet<Employee> setOfEmployees = new HashSet<Employee>();
		setOfEmployees.add(new Employee(10101,"Priyanka",100000));
		setOfEmployees.add(new Employee(10201,"Anubhav",350000));
		setOfEmployees.add(new Employee(10101,"Priyanka",100000));
		
		System.out.println(setOfEmployees.size()); // 3 // 2 
		
		for(Employee e : setOfEmployees) {
			System.out.println(e.getEmpid() + "-" + e.getEmpname() + "-" + e.getEmpSalary());
		}
		
		/*String name = "Maulik";
		int n = 16;
		int temp = name.hashCode();
		System.out.println(temp);
		System.out.println(temp & (n-1));*/
	}
}
