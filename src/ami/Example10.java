package ami;

class Example10{
	int num = 100;
		
	void displayName (String name ,int id){
		System.out.println("Name is " + name);
		System.out.println("id is " + id);
	}
		
	public static void main (String[] a){
		String name = "technno";
		Example10 example10 = new Example10();
		example10.displayName("name",example10.num);// we can not write like that example10.displayName("name",num)bcz
		//num instant variable 6e so ene call kravva refreance variable ni jrur pde
		example10.displayName("joy",12);
	}
}