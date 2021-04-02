package siddhant;

public class EvenNum{
	void numbers(int start,int end){
		for(int index= start;index<=end;index++){
			if(index%2==0){
				System.out.printf("\n The even numbers are : " +index);
			}
		}
	}
	public static void main(String[] args){
		EvenNum en = new EvenNum();
		en.numbers(10,15);
	}
}
		
