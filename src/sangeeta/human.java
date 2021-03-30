/*
 * Create a class named human and that class have some behaviour (method)like name, age& canSpeak.
 *1) humanName() 2) canSpeak 3)humanAge 4)showDetails.
//One string, one boolean and one int variable needed
 */
package sangeeta;

class Human{
	String name;
	int age;
	boolean canSpeak;
	
	void humanName( String hName){
		name = hName;	
	}
	
	void humanCanSpeak(boolean flag){
		canSpeak = flag;
	}
	
	void humanAge(int hAge){
		age = hAge;	
	}
	
	void showDetails(){
		System.out.println(" Human name is "+name);
		System.out.println(" Can human speak? "+canSpeak);
		System.out.println(" Human age is "+age);	
	}
	
	public static void main(String[] a){
		Human human = new Human();
		human.humanName("Shital");
		human.humanCanSpeak(false);
		human.humanAge(45);
		human.showDetails();
	}

}