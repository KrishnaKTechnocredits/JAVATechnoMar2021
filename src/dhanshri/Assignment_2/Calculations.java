package dhanshri.Assignment_2;

public class Calculations {

 void squareNum(int num){
  int square = num * num;
  System.out.println("Square of number is  "+square);
 }

 void cubeNum(int cnum){
  int cube = cnum*cnum*cnum;
  System.out.println("Cube of number is "+cube);
 }
 
 public static void main(String[] args){
  Calculations calculations1 = new Calculations();
  calculations1.squareNum(5);
  calculations1.cubeNum(6);
 }
}