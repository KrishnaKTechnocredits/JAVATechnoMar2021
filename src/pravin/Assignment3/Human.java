/*Assignment no 3
Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak
a. humanName()b. canSpeak()c. humanAge()d. showDetails()
Hint: One String, one boolean, one int variable needed.*/
package pravin.Assignment3; 
class Human {
	String Name;
	int age;
	boolean canSpeak;

	void behaviour (String name,int Age,boolean speak){

		Name = name;
		age = Age;
		canSpeak = speak;

	}
	void display(){
		System.out.println("Name is :"+Name);
		System.out.println("Age is "+age);
		System.out.println("can he speak? "+canSpeak);
	}

	public static void main(String[]args){
		Human human = new Human();
		human.behaviour("PRAVIN",35,true);
		human.display();
	}
}
