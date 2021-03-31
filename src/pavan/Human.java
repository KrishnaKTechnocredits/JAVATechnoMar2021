/*
 3. Create a class named Human, & that class have some behaviour(method) like name, age & canSpeak  
	a. humanName()  
	b. canSpeak()  
	c. humanAge()  
	d. showDetails() 
Hint: One String, one boolean, one int variable needed. 
 */

package pavan;
class Human{
	
	String name;
	boolean canSpeak;
	int age;
	
	void humanName( String hu){
		name= hu;
	}
	
	void humaCanSpeak( boolean speak){
		canSpeak= speak;
	}
	
	void humanage(int old ){
		age= old;
	}
	
	void showdetails(){
		System.out.println("name :"+ name);
		System.out.println ("can he speak :"+ canSpeak);
		System.out.println("his age is : "+ age);
	}
	
	public static void main(String[]args){
		Human human= new Human();
		human.humanName("Pavan");
		human.humaCanSpeak(true);
		human.humanage(11);
		human.showdetails();
	}
}

