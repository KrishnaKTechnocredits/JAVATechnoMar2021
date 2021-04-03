package simmi;

class Num
{
 void output(float a)
 { 
   float b = a * a;
   float c = a * a * a;
   System.out.println("Square of a number is" + b);
   System.out.println("Cube of a number is" + c);
 }
 public static void main(String[] args)
 {
   Num n = new Num();
   n.output(2);
 }
}
  