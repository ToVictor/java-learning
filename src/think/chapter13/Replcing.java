package think.chapter13;

public class Replcing {
	static String s = Splitting.knights;
	public static void main(String[] args) {
		System.out.println(s.replaceFirst("f\\w+", "located"));
		System.out.println(s.replaceAll("shrubbery|tree|herring", "banana"));
	}
}
