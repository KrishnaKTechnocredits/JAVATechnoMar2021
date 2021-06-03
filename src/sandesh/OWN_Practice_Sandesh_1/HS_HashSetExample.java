package sandesh.OWN_Practice_Sandesh_1;

import java.util.Arrays;
import java.util.HashSet;

public class HS_HashSetExample {

	public static void main(String[] args) {
		String[] namesArray = {"Ankit", "Prachi", "Monika", "Shashank", "Sandesh",
								"Vaibhav", "Vaibhav", "1", "1", "*", "0"};
		HashSet<String> nameSetExample = new HashSet<String>(Arrays.asList(namesArray));
		System.out.println(nameSetExample);
	}
}
