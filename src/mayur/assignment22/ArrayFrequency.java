package mayur.assignment22;

public class ArrayFrequency{
	
	void stringChar(String input) { 
		for (int index = 0; index < input.length(); index++) {
		char targetChar = input.charAt(index);
		if (input.indexOf(targetChar) == index)
			freqOfAllChar(input, targetChar);
	}
}

	void freqOfAllChar(String input, char targetChar) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == targetChar)
				count++;
	}
	System.out.println(targetChar + " is " + count + " time in " + input);
}

void iterateArray(String[] input) {
	for (int index = 0; index < input.length; index++) {
		stringChar(input[index]);
	}
}

public static void main(String[] args) {
	ArrayFrequency array = new ArrayFrequency();
	String[] input = { "raj", "aarya", "aavruti", "shruti" };
	array.iterateArray(input);
}
}
