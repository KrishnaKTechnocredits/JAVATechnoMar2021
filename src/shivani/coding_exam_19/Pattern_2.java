package shivani.coding_exam_19;
/*Program 2 - Print below pattern
G L O B A N T
G L O B A N
G L O B A 
G L O B
G L O
G L
G*/
public class Pattern_2 {
	
   void pattern2(char arr[]) {
		
	   /*for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j <=i;j++) {
				
				System.out.print(arr[j]);
			}
			System.out.println();
		}*/

		for (int revIndex = arr.length; revIndex >= 0; revIndex--) {
			for (int j = 0; j <revIndex; j++) {
				
				System.out.print(arr[j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Pattern_2 pattern2 = new Pattern_2();
		char input[]= {'G','L','O','B','A','N','T'};
		pattern2.pattern2(input);
	}

}
