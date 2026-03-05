package aggregation;

public class StringBase {
	public static void main(String[] args) {
		char[] letters = {'A','k','A','S','H'};
		String name = new String(letters);
		System.out.println(name);
		String jumbled = "Akash1IS1From1B1Section";
		String[] words = jumbled.split("1");
		System.out.println(words[1]);
		for (Object o : words) {
			System.out.print(o + " ");
		}
	}

}
