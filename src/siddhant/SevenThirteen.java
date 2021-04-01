package siddhant;

public class SevenThirteen{
	void seventhirteen(int start, int end){
		for(int index = start; index <=end ; index++){
			if(index%7==0 || index%13==0){
				System.out.println(" \n The numbers divisible by seven or thirteen are : " +index);
			}
		}
	}
	public static void main(String[]args){
		SevenThirteen st = new SevenThirteen();
		st.seventhirteen(5,40);
	}
}