package monali;

class Human{
	String name;
	boolean hcanspeak;
	int age;
	
	void humanName(String person){
		name = "vikas";
	}
	
	void canSpeak(boolean flag){
		hcanspeak = flag;
	}
	
	void humanAge(int num){
		age = num;
	}
	void showDetails(){
		System.out.println("name of person is "+name);
		System.out.println("person can speak" +hcanspeak);
		System.out.println("age of person is "+age);
	}
	
	public static void main(String[] a){
		Human human = new Human();
		human.humanName("vikas");
		human.canSpeak(true);
		human.humanAge(35);
		human.showDetails();
	}
}
		 
		
		
