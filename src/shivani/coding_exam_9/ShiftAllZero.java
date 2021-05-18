package shivani.coding_exam_9;
/*Programming Test - 9 [15 mins]
Shift all Zero's at the end.

input : [1,3,0,3,0,6,0,9,23,45];
output : [1,3,3,6,9,23,45,0,0,0]*/
public class ShiftAllZero{

    int[] shiftZero(int[] arr){
	  int[] temp = new int [arr.length];
	  int cnt=0;
	  for(int i =0;i<arr.length;i++){
	       if(arr[i]>0){
		      temp[cnt]=arr[i];
		      cnt++;
			  }
	       
		   }
	  return temp;
	}
	  public static void main(String[] args){
	     //ShiftAllZero shiftAllZero = new ShiftAllZero();
		  int[] input = {1,3,0,3,0,6,0,9,23,45};
		  int[] output = new ShiftAllZero().shiftZero(input);
		  for (int index = 0; index < input.length; index++) {
				
			
			System.out.println(output[index]);
			
			}
		  
		  
		 
	  
	  }
	
	

}
