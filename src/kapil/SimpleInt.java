package kapil;

class SimpleInt{
 
    void Si (int p, int r, int t){
	int ans = p*r*t/100;
	System.out.println("Simple interest is "+ans);
	}
	
	public static void main(String[] args)
	{
	  SimpleInt simpleint1 = new SimpleInt();
	  simpleint1.Si(1000,5,2);
	  }
}