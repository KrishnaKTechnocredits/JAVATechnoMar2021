package sandesh.coding_exam_2;

public class SumIntegers {
    int sum;
    
    int getAddition(String comboStr){
    	int eachNum = Integer.parseInt(comboStr);
        sum += eachNum;
        return sum;
    }
    
    int getEachInteger(String inStr){
        int sumNum = 0;
        for(int index = 0; index < inStr.length(); index++){
            String combo = "";
            if(inStr.charAt(index) <= 57 && inStr.charAt(index+1) > 57){
                combo += inStr.charAt(index);
                sumNum = getAddition(combo);
            }
            else if(inStr.charAt(index) <= 57 && inStr.charAt(index+1) <= 57){
                combo += inStr.charAt(index);
                combo += inStr.charAt(index+1); 
                sumNum = getAddition(combo);
                index++;
            }
        }
        return sumNum;
    }    
    
    public static void main(String args[]) {
        String str = "12h14i4w8sdc15";
        int returnedSum = new SumIntegers().getEachInteger(str);
        System.out.println(returnedSum);
      
    }
}