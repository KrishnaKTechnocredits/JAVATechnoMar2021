package krishna;
class Human{
	String employeename;
	boolean isSpeak;
	int empAge;
	
	void setHumanName(String name){
		employeename=name;
	}
	void setCanSpeak(boolean speak){
		isSpeak=speak;
	}
	void setHumanAge(int age){
		empAge=age;
	}
	void showDetails(){
		System.out.println("Employee name is :"+employeename);
		System.out.println("Is employee can speak :"+isSpeak);
		System.out.println("Age of employee is :"+empAge);
	}
	public static void main(String[] args){
		Human human= new Human();
		human.setHumanName("krishna");
		human.setCanSpeak(true);
		human.setHumanAge(30);
		human.showDetails();
		
	}
}