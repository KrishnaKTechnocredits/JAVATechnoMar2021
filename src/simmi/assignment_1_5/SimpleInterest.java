package simmi;

class SimpleInterest
{ 
  void interest(float p, float r, float t)
  {
    float si = p * r * t;
	System.out.println("Simple interest is " + si);
  }
    public static void main(String[] args)
  {
    SimpleInterest a = new SimpleInterest();
	a.interest(2,3,1);
  }
}
  