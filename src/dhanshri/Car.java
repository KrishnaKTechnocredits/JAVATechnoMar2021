package dhanshri;

public class Car{
 String carCompany;
 boolean isAutomatic;
 double carSpeed;

 void setCompanyName(String comName){
  carCompany = comName;
 }

 void setIsCarAutomatic(boolean flag){
  isAutomatic = flag;
 }

 void setCarSpeed(double speedC){
  carSpeed = speedC;
 }

 void displaySPecification(){
  System.out.println("Car company name is "+carCompany);
  System.out.println("Is car Automatic: "+isAutomatic); 
  System.out.println("Speed of car is "+carSpeed);
 }
 
 public static void main(String[] args){
  Car car = new Car();
  car.setCompanyName("Audi");
  car.setIsCarAutomatic(true);
  car.setCarSpeed(120.55);
  car.displaySPecification();
 }
}