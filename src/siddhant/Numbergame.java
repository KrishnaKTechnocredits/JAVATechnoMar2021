package siddhant;

class Numbergame{
		void findMaxnumbers(int a,int b,int c){
					if(a>b && a>c){
						System.out.println("Maximum number is " +a);
					}
					else if(b>a && b>c){
						System.out.println("Maximum number is " +b);
					}
					else if(c>a && c>b){
						System.out.println("Maximum number is " +c);
					}
					else if(a==b && b==c){
						System.out.println("Maximum number could not be found all numbers are same.");
					}
				}
		void findminnumbers(int a,int b,int c){
					if(a<b && a<c){
						System.out.println("Minimum number is " +a);
					}
					else if(b<a && b<c){
						System.out.println("Minimum number is " +b);
					}
					else if(c<a && c<b){
						System.out.println("Minimum number is " +c);
					}
				
				}			
					public static void main(String[] a){
						Numbergame ng1 = new Numbergame ();
						ng1.findMaxnumbers(13,9,14);
						ng1.findMaxnumbers(12,12,12);
						ng1.findminnumbers(13,9,14);
					}
		}
							
			