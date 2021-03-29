//Assignment 4

package rupali;
class NumberGame{
		void findMaxNumber(int number1, int number2, int number3){
			if(number1>number2 && number1>number3){
				System.out.println(number1+" is maximum");
			}
			else
				if(number2>number3){
				System.out.println(number2 +"is maximum");
				}
				else
					if(number1 == number2 && number2 == number3){
					System.out.println("All 3 are equal numbers");
					}
					else
						System.out.println(number3+" is maximum");
		}
		
		void findMinNumber(int number1, int number2, int number3){
			if(number1<number2 && number1<number3){
				System.out.println(number1+" is manimum");
			}
			else
				if(number2<number3){
				System.out.println(number2 +"is manimum");
				}
				else
					if(number1 == number2 && number2 == number3){
					System.out.println("All 3 are equal numbers");
					}else
						System.out.println(number3+" is manimum");								
		}

		public static void main(String[] args){
			NumberGame numbergame= new NumberGame();
			numbergame.findMaxNumber(20,30,50);
			numbergame.findMinNumber(20,30,50);
		}
}