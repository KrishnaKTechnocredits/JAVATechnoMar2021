/*
 *assignment 4maximum and minimum of 3 no using if else
 */
package purva;
 class NumberGame{

	
	void findMaxNumber(int max1,int max2,int max3){
		if (max1 > max2 && max1 > max3){
		System.out.println("greater number is"+max1);
		}
		else if(max2 > max3){
		System.out.println("greater number is"+max2);
		}
		else if(max1==max2 && max2==max3){
		System.out.println("Maximum number could not found,all numbers are equal");
		}
		else {
		System.out.println("greater number is"+max3);
		}
	}
	
	void findMinimumNumber(int max1,int max2, int max3){
		if(max1<max2 && max1<max3){
			System.out.println("minimum number is"+max1);
		}
		else if(max2<max3){
			System.out.println("minimum number is"+max2);
		}
		else if(max1==max2 && max2==max3){
		    System.out.println("Maximum number could not found,all numbers are equal");
		}
		else{
			System.out.println("minimum number is"+max3);
		}
	}

    public static void main(String[] a){
        NumberGame numberGame = new NumberGame();
        numberGame.findMaxNumber(2,3,4);
		numberGame.findMaxNumber(4,4,4);
		numberGame.findMinimumNumber(9,5,4);
		numberGame.findMinimumNumber(22,22,22);
	}
}