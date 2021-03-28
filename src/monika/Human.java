package monika;

/*Assignment3 
3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
Hint: One String, one boolean, one int variable needed. */

class Human{
String name;
boolean speak;
int age;

void humanName(String humanName){
	name = humanName;
}
void canSpeak(boolean canSpeak){
	speak = canSpeak;
}
void humanAge(int humanAge){
	age = humanAge;
}
void showDetails(){
	System.out.println("Human Name is "+name+"\n"+"Able to speak "+speak+"\n"+"Age is "+age);
}
public static void main(String[] args){
	Human human = new Human();
	human.humanName("Monika");
	human.canSpeak(true);
	human.humanAge(16);
	human.showDetails();
}
}