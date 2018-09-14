package think.chapter13.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class E15_Scc {
	public static void main(String[] args) {
		String s = TextFile.read("src/think/chapter13/practice/E15_Scc.java");
		Pattern p = Pattern.compile("^\\b[Ssct]\\w+",Pattern.CASE_INSENSITIVE | Pattern.MULTILINE);
		Matcher m = p.matcher("Su\nchao\nChen");
		int index = 0;
		while(m.find()){
			System.out.println(index++  + ": " +
				       m.group() + ": " + m.start());
		}
	}
}
