package bhushan;
class numberGameWhileLoop{
	void evenNo(int rangeFrom, int rangeTo){
	System.out.println("Even numbers are: ");
	int i=rangeFrom;
		while(i<=rangeTo){
			if(i%2==0){
				System.out.println(+i);
			}
			i++;
		}
	}
	
	void divByFive(int rangeFrom, int rangeTo){
	System.out.println("All numbers which are divisible by 5: ");
	int i=rangeFrom;
		while(i<=rangeTo){
			if(i%5==0){
				System.out.println(+i);
			}	
			i++;
		}
	}
	
	void divByFiveAndThree(int rangeFrom, int rangeTo){
	System.out.println("All numbers which are divisible by 5 and 3: ");
	int i=rangeFrom;
		while(i<=rangeTo){
			if(i%5==0 &&i%3==0){
				System.out.println(+i);
			}	
			i++;
		}
	}
	void divBySevenAndThirteen(int rangeFrom, int rangeTo){
	System.out.println("All numbers which are divisible by 7 and 13: ");
	int no=7;
	int no2=13;
	int i=rangeFrom;
		while(i<=rangeTo){
			if(i%7==0){
			System.out.println(+i+" is divisible by "+no);
			}
				else if(i%13==0){
					System.out.println(+i+" is divisible by "+no2);
				}
				i++;
	}
}
	public static void main(String[] args){
		numberGame2 noGame1 = new numberGame2();
		noGame1.evenNo(10,15);
		numberGame2 noGame2 = new numberGame2();
		noGame2.divByFive(10,30);
		numberGame2 noGame3 = new numberGame2();
		noGame3.divByFiveAndThree(5,18);
		numberGame2 noGame4 = new numberGame2();
		noGame4.divBySevenAndThirteen(5,40);
	}
}