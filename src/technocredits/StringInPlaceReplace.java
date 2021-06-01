package technocredits;

public class StringInPlaceReplace {

	public static void main(String[] args) {
		
		final StringBuilder builder = new StringBuilder("techno");
		
		int length = builder.length();
		for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
			final char current = builder.charAt(i); // t e
			builder.setCharAt(i, builder.charAt(j)); // swap // 0 --> o
			builder.setCharAt(j, current); // 5 --> t // onchet
		}
		System.out.println(builder);
	}
}
