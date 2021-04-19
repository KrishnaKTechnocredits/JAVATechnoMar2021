//create a class named human, and that class have some behaviour(method) like name, age and canspeek.
//a. humanName(), b. humanAge(), c. canSpeek(), d. showDetails().

package ashwini;

class human{
	String humanName;
	int humanAge;
	boolean canSpeek;
	
	void humanName(String name){
		humanName = name;
	}
	
	void humanAge(int age){
		humanAge = age;
	}
	
	void canSpeek(boolean flag){
	canSpeek = flag;
	}
	
	void showDetails(){
		System.out.println("Human name is :"+ humanName);
		System.out.println("Human age is :"+ humanAge);
		System.out.println("Human can speek :"+ canSpeek);
	}
	
	public static void main(String args[]){
		human human1 = new human();
		human1.humanName("Ashwini jadhav");
		human1.humanAge(27);
		human1.canSpeek(false);
		human1.showDetails();
	}
}
