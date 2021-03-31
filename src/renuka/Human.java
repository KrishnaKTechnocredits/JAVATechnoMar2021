/*Assignment-3 :Create a class named Human & that class have some behaviour(method) like name,age & canSpeak*/

package renuka;

class Human{
	String humanName;
	boolean canSpeak;
	int humanAge;
	
    void humanName(String name){
	  humanName = name;
	}
	
	void canSpeak(boolean speak){
	  canSpeak = speak;
	}
	
	void humanAge(int age){
	  humanAge = age;
	}
	
	void showDetails(){
	  System.out.println("Human Name is: " +humanName);
	  System.out.println("Is Human Speak: " +canSpeak);
	  System.out.println("Human Age is: " +humanAge);
	}
	
	public static void main(String[] args){
	  Human human = new Human();
	  human.humanName("Renuka");
	  human.canSpeak(true);
	  human.humanAge(26);
	  human.showDetails();
	}
}