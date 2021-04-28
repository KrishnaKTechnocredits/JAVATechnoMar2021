package ami;

class Example9{
		
	void displayName (String name ,int id){
		System.out.println("Name is " + name);
		System.out.println("id is " + id);
	}
		
	public static void main (String[] a){
		Example9 example9 = new Example9();
		example9.displayName("Techno",10);
	}
}