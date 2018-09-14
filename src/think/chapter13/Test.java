package think.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
	public static void main(String[] args) {
		//str的组成是  空格+单词边界+2+单词边界+空格
		String str = " 2 ";
		String regex = "\\s\\b2\\b\\s";
		System.out.println(str.matches(regex)); //true
		regex = "\\b2\\b";
		System.out.println(str.matches(regex)); //false
		
		
//		Pattern p = Pattern.compile(regex);
//		Matcher m = p.matcher(str);
//		System.out.println(m.matches());
	}
}
