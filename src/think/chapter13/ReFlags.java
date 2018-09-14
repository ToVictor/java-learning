package think.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReFlags {
	public static void main(String[] args) {
		
		// 不区分大小写并且匹配多行，p和p2的作用是一致的
		Pattern p = Pattern.compile("^java",Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
//		Pattern p2 = Pattern.compile("(?im)^java");
		
		Matcher m = p.matcher("java has regex\nJava has regex\n"
				+ "JAVA has pretty good regular expression\n"
				+ "Regular expression are in Java");
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
