package sandesh.Assignment_3;

public class Human {
	String humanNameInstance;
	boolean speakInstance;
	int ageInstance;
	
	void setHumanName(String humaneNameData) {
		humanNameInstance = humaneNameData;
	}
	
	void setCanSpeak(boolean canSpeakData) {
		speakInstance = canSpeakData;
	}
	
	void setAge(int ageData) {
		ageInstance = ageData;
	}
	
	void displaySpecification() {
		System.out.println("Name of Human being is :- " + humanNameInstance);
		System.out.println("Can Human being named " + humanNameInstance + " speak :-" + speakInstance);
		System.out.println("Age of Human being named " + humanNameInstance + " is " + ageInstance);
	}
	
	public static void main(String[] args) {
		Human h1 = new Human();
		String humanName = "Sandesh";
		boolean canSpeak = true;
		int age = 30;
		h1.setHumanName(humanName);
		h1.setCanSpeak(canSpeak);
		h1.setAge(age);
		h1.displaySpecification();
	}
}
