package simmi;

class Example8
{
  void add(int n1, int n2)
   {
     int ans = n1 + n2;
	 System.out.println("Addition is\n" + ans);
	}
public static void main(String[] args)
{
  Example8 e = new Example8();
  e.add(10,20);
  e.add(20,30);
 }
}