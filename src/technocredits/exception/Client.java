package technocredits.exception;

import java.io.IOException;

public class Client {

	public static void main(String[] args) {
		Parent p1 = new Child();
		try {
			p1.m1();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
