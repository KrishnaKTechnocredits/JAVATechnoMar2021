package kajal.StringAndCharProgram;
import java.util.Scanner;

public class Assignment_18p3 {
		void printAsciiAtoZ() {
			for(int index=65; index<=90; index++) {
			//char i = (char)index;
					
			System.out.println("Ascii values of " +index +" is " +(char)index);
			}
		}
		public static void main(String [ ]args) {
			new Assignment_18p3().printAsciiAtoZ();
			
		}
}
