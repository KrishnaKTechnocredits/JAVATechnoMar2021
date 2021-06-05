package sangeeta.CodingExam;

public class CodingExam19 {
	
	static void pattern1(String str) {
		String [] arr = str.split("");
		for(int i = 0 ; i < arr.length; i++) {
			for(int j = 0 ; j <= i ; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		} 
	}
	
	static void pattern2(String str) {
		String [] arr = str.split("");
		for(int i = arr.length ; i > 0 ; i--) {
			for(int j = 0 ; j < i ; j++) {
				System.out.print(arr[j]+" ");
			}
			System.out.println();
		} 
	}
	
	public static void main(String[] args) {
		CodingExam19.pattern1("GLOBANT");
		CodingExam19.pattern2("GLOBANT");
	}

}
