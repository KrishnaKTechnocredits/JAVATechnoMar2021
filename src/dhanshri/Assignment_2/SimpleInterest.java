package dhanshri.Assignment_2;

public class SimpleInterest{

 void SIcalculation(int p, int t, int r){
  int SI = (p*t*r)/100;
  System.out.println("Simple Interest is "+SI);
  }

 public static void main(String[] args){
 SimpleInterest simpleInterest = new SimpleInterest();
 simpleInterest.SIcalculation(50,5,2);
 }
}