package shivani.coding_exam_19;
/*Program 1 - Print below pattern
G
G L
G L O
G L O B
G L O B A
G L O B A N
G L O B A N T*/
public class Pattern1 {
	
	void pattern(char arr[]) {
		
		for(int i=0;i<=arr.length;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(arr[j]);
				
			}
			System.out.print("\n");
	
		}
		
		
	}
	
	public static void main(String[] args) {
		Pattern1 pattern1 = new Pattern1();
		char input[]= {'G','L','O','B','A','N','T'};
		pattern1.pattern(input);
	}
}
