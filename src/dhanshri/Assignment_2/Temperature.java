package dhanshri.Assignment_2;

public class Temperature{

 void tempInCelsius(int fahrenheit ){
  float Celsius = (fahrenheit - 32) * 5 / 9;
  System.out.println("Temperature in Celsius is "+Celsius);
 }
 
 public static void main(String[] args){
 Temperature temp = new Temperature();
 temp.tempInCelsius(85);
 }
}