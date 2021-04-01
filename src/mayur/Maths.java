

package mayur;


public class Maths {
	int startIndex, endIndex, index;
	
	void evenNumber(int startIndex,int endIndex){
		for(index = startIndex;index<=endIndex;index++) {
			if(index%2==0) {
				System.out.println("Even Numbers are:" +index);
			}
		}
	}
		
		void five(int startIndex,int endIndex) {
			for(index = startIndex;index<=endIndex;index++) {
				if(index%5==0) {
					System.out.println("Numbers divisible by 5 are:" +index);
				}
			} 
		}
		
		void fiveAndThree(int startIndex,int endIndex) {
			for(index = startIndex;index<=endIndex;index++) {
				if(index%5==0 && index%3==0) {
					System.out.println("Numbers divisible by 5 and 3 are:" +index);
				}
			}
		}
		
		void sevenOrThirteen(int startIndex,int endIndex) {
			for(index = startIndex;index<=endIndex;index++) {
				if(index%7==0 || index%13==0) {
					System.out.println("Numbers divisible by 7 or 13 are:" +index);
				}
			}
		}
		
		public static void main(String[] args) {
			Maths maths = new Maths();
			maths.evenNumber(10,15);
			maths.five(10,30);
			maths.fiveAndThree(5,18);
			maths.sevenOrThirteen(5,40);
		}
		
	
		
			
				
	}


