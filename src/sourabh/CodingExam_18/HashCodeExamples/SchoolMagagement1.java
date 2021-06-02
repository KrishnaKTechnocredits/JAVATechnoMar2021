package sourabh.CodingExam_18.HashCodeExamples;

//import java.util.HashSet;
import java.util.LinkedHashSet;

public class SchoolMagagement1 {
	public static void main(String[] args) {
		LinkedHashSet<Student1> stuList= new LinkedHashSet<Student1>();
		Student1 stu1= new Student1(101, "Abhi", "Sen", "Kolkata");
		Student1 stu2= new Student1(102, "Sourabh", "Saha", "Delhi");
		Student1 stu3= new Student1(101, "Abhi", "Roy", "Pune");
		Student1 stu4= new Student1(103, "Roni", "Sen", "Kolkata");
		
		stuList.add(stu1);
		stuList.add(stu2);
		stuList.add(stu3);
		stuList.add(stu4);
		
		System.out.print(stuList);
	}
}
