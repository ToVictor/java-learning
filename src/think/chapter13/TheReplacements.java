package think.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

/*! Here's a block of text to use as input to
  the regular expression matcher. Note that we'll
  first extract the block of text by looking for
  the special delimiters, then process the
  extracted block. !*/
public class TheReplacements {
	public static void main(String[] args) {
		String s = TextFile.read("src/think/chapter13/TheReplacements.java");
		Matcher m = Pattern.compile("/\\*!(.*)!\\*/",Pattern.DOTALL).matcher(s);
		if(m.find()){
			s = m.group(1);
		}
		printStr(s);
		// 2个以上的空格替换成单个空格
		s = s.replaceAll(" {2,}", " ");
		printStr(s);
		// 每行开始处的空格替换成空字符串
		s = s.replaceAll("(?m)^ +", "");
		printStr(s);
		// 替换第一个匹配的元音字母
		s = s.replaceFirst("[aeiou]", "(VOWEL1)");
		printStr(s);
		
		StringBuffer sb = new StringBuffer();
		Pattern p = Pattern.compile("[aeiou]");
		Matcher m2 = p.matcher(s);
		while(m2.find()){
			m2.appendReplacement(sb, m2.group().toUpperCase());
		}
		m2.appendTail(sb);
		System.out.println(sb);
	}
	
	public static void printStr(String str){
		System.out.println(str);
		System.out.println("---------------------------------");
		System.out.println();
	}
}
