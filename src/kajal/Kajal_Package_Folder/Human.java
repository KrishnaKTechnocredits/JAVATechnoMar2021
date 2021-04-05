//Assignment 3 program-3-- one string one boolean, one int variable needed.

package kajal.Kajal_Package_Folder;

class Human{
	String humanname;
	int humanage;
	boolean canspeak;
	
	void humanName(String name){
		humanname=name;
	}
	void humanAge(int age){
		humanage= age;
	}
	void canSpeak(boolean isspeak){
		canspeak= isspeak;
	}
	void showDetails(){
		System.out.println("Human name is " +humanname);
		System.out.println("Human's age is " +humanage);
		System.out.println("Human can speak " +canspeak);
	}
	
	public static void main(String [] args){
	Human human = new Human();
	human.humanName("Kajal");
	human.humanAge(25);
	human.canSpeak(true);	
	human.showDetails();
	
	}
	}