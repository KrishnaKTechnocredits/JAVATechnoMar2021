/*Write a Java program to compute simple interest   
	Simple Interest = (P x T x R)/100 
	Where, 
		P is the principle amount 
		T is the time [year] and 
		R is the rate*/


package simmi.assignment_1_5;

class SimpleInterest
{ 
  void interest(float p, float r, float t)
  {
    float si = (p * r * t)/100;
	System.out.println("Simple interest is " + si);
  }
    public static void main(String[] args)
  {
    SimpleInterest a = new SimpleInterest();
	a.interest(2,3,1);
  }
}
  