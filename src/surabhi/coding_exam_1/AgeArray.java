package surabhi.coding_exam_1;

/*WAP to provide the difference between a Younger and an elder member of the family. Age is provided in the form of an array.

Sample Input: 7 12 56 62 25

Sample Output: 55*/
 
public class AgeArray {
	
	int getAge(int[] arr) {
		int maxAge=arr[0],minAge=arr[0];
		for(int index=1; index<arr.length;index++) {
			if(arr[index]>maxAge) {
				maxAge=arr[index];			
			if(arr[index]<minAge)		
				minAge=arr[index];
			}
		} 
		return maxAge-minAge;
	}
	 
	void display(int age) { 
		System.out.println(age);
	}
	
 
	public static void main(String[] args) {
		AgeArray ageArray=new AgeArray();
		int[] age= {7,12,56,62,25};
		int ageDiff=ageArray.getAge(age);
		ageArray.display(ageDiff);
	}

}
