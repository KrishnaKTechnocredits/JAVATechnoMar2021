//Assign2- program1. WAP to find square and cube of a number note: one method to calculate square and another for cube

package kajal.Kajal_Package_Folder;

class Calculate{ 
	int num1 = 4;
		void square(){
			int answer= num1 * num1;
			System.out.println("square of 4 is " + answer);
			}
		void cube(){
			int answer= num1 * num1 * num1;
			System.out.println("cube of 4 is " + answer );
			}
		public static void main(String [] args){
			Calculate calculate1 = new Calculate();
			calculate1.square();
			calculate1.cube();
		}
}