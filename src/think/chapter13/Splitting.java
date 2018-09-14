package think.chapter13;

import java.util.Arrays;

public class Splitting {
	public static String knights = 
			"Then, when you have found the shrubbery, you must "+
			"cut down the mightiest tree in the forest... " +
			"with... a herring"
			;
	public static void split(String regex){
		System.out.println(Arrays.toString(knights.split(regex)));
	}
	public static void main(String[] args) {
		split(" ");
		System.out.println("-----------------------");
		split("\\W+");
		System.out.println("-----------------------");
		split("n\\W+");
		
		System.out.println(Arrays.toString(knights.split("\\W+", 3)));
		System.out.println(knights.split("\\W+", 3).length);
	}
}
