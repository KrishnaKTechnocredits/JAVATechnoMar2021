package siddhant;

public class Fivethree{
	void fivethree(int start, int end){
		for(int index= start;index<=end;index++){
			if(index%3==0 && index%5==0){
				System.out.println(" \n The numbers divisible by three and five are : " +index);
			}
		}
	}
	public static void main(String[]args){
		Fivethree ft = new Fivethree();
		ft.fivethree(5,15);
	}
}
			
	
