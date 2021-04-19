package krati_Shukla.Exam1;

public class AgeDifference {
	
	 void CalculateDifference(int[] age){
		 int min=0;
		 int max=0;
		 int length = age.length;
		 min= age[0];
		 max= age[0];
		 for(int newIndex=1; newIndex<length; newIndex++) {
			if (min > age[newIndex]) {
				min = age[newIndex];
			}
			if (max < age[newIndex]) {
				max = age[newIndex];
			 }
		 }

		 int difference = max-min;
		 System.out.println("Difference is "+difference);
	 }
	 
	 public static void main(String[] a) {
		 AgeDifference ageDifference = new AgeDifference();
		 int[] age = {7, 12, 56, 62, 25};
		 ageDifference.CalculateDifference(age);
	 }
}
