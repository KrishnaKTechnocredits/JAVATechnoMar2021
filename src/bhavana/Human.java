package bhavana;
class Human{
	String name;
	boolean speakingAbility;
	int age;
	
	void setHumanDetails(String person_name,int person_age){
		name=person_name;
		age=person_age;
	}

	void canSpeak(boolean canTalk){
		speakingAbility=canTalk;
	}
	
	void showDetails(){
		System.out.println("Name of the person is:" +name);
		System.out.println("Age of the person is:" +age);
		System.out.println("Speaking ability is:" +speakingAbility);
	}
	
	public static void main(String[] args){
		Human h= new Human();
		h.setHumanDetails("Gopal",32);
		h.canSpeak(false);
		h.showDetails();
	}
}