/*Assignment-2 :Write a java program to compute simple interest*/

package renuka;

class Interest{
   
   void simpleInterest(int p, int t, double r){
      double SimpleInterest = (p* t* r)/100;
	  System.out.println("Simple Interest is: " +SimpleInterest);
   }
   
   public static void main(String[] args){
      Interest sI = new Interest();
	  sI.simpleInterest(100,10,5.5);
   }
}