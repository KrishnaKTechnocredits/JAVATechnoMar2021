package vaibhav.Practive.Collections;

import java.util.ArrayList;

public class Example2AllStudentDetails {

	public static void main(String[] args) {

		ArrayList<Example3Student> studentDeatils = new ArrayList<Example3Student>();

		Example3Student s1 = new Example3Student(1, "Vaibhav");
		Example3Student s2 = new Example3Student(2, "Sandesh");
		Example3Student s3 = new Example3Student(3, "Ankit");
		Example3Student s4 = new Example3Student(4, "Shashank");
		Example3Student s5 = new Example3Student(5, "Monika");
		Example3Student s6 = new Example3Student(6, "Prachi");

		studentDeatils.add(s1);
		studentDeatils.add(s2);
		studentDeatils.add(s3);
		studentDeatils.add(s4);
		studentDeatils.add(s5);
		studentDeatils.add(s6);

		System.out.println("Printing all student details with index information of ArrayList ");
		// System.out.println("Individual values stored at each index of ArrayList are
		// as below ");
		System.out.println("-----------------------------------------------------------------");

		for (int index = 0; index < studentDeatils.size(); index++) {
			System.out.println("Index " + index + " details : ");
		//	Example3Student temp = studentDeatils.get(index);
		//	System.out.println("Roll No : " + temp.rollNo + "--> Name of student :" + temp.name);
			System.out.println("Roll No : " + studentDeatils.get(index).rollNo + "--> Name of student :" + studentDeatils.get(index).name);
			System.out.println("");

		}

	}
}
