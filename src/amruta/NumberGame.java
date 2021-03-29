package amruta;

class NumberGame{

		void findMaxnumber(int a, int b,int c){
			if(a>b && a>c){
				System.out.println("Maximum number is : "+a);
			}else if(b>a && b>c){
				System.out.println("Maximum number is : "+b);
			}else if(c>a && c>a){
				System.out.println("Maximum number is : "+c);
			}else{
				System.out.println("Maximum number could not found, all given numbers are same.");
			}
		}
		void findMinNumber(int a, int b, int c){
				if(a<b && a<c){
				System.out.println("Minimum number is : "+a);
			}else if(b<a && b<c){
				System.out.println("Minimum number is : "+b);
			}else if(c<a && c<a){
				System.out.println("Minimum number is : "+c);
			}else{
				System.out.println("Minimum number could not found, all given numbers are same.");
			}	
		}
		public static void main(String[] args){
			NumberGame numbergame = new NumberGame();
			numbergame.findMaxnumber(5,6,9);
			numbergame.findMinNumber(5,6,9);
			numbergame.findMaxnumber(3,3,3);
			numbergame.findMinNumber(3,3,3);
		}
}