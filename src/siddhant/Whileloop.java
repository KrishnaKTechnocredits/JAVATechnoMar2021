package siddhant;

public class Whileloop{
	int start;
	int end;
	void Evennumbers(int a){
		end = a;
		start = 10;
		while(start<=a){
			if(start%2==0){
				System.out.println("\n The even numbers are : " +start);
			}
			start++;
		}
	}
	void Divisiblefive(int b){
		end = b;
		start = 10;
		while(start<=b){
			if(start%5==0){
				System.out.println("\n The numbers divisible by 5 are : " +start);
			}
			start++;
		}
	}
	void Fivethree(int c){
		end = c;
		start = 5;
		while(start<=c){
			if(start%5== 0 && start%3 == 0){
				System.out.println("\n The numbers divisible by five and three are : " +start);
			}
			start++;
		}
	}
	void Seventhirteen(int d){
		end = d;
		start = 5;
		while(start<=d){
			if(start%7==0 || start%13==0){
				System.out.println("\n The numbers divisible by seven or thirteen are : " +start);
			}
			start++;
		}
	}
	public static void main(String[]args){
		Whileloop wp = new Whileloop();
		wp.Evennumbers(15);
		wp.Divisiblefive(30);
		wp.Fivethree(18);
		wp.Seventhirteen(40);
		}
}