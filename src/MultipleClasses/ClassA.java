package MultipleClasses;

public class ClassA implements Comparable<T>{
	
	public void m1() {
		System.out.println("I am in m1 of class A");
	}

	public static void main(String[] args) {
		ClassA a=new ClassA();
		a.m1();

		
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
