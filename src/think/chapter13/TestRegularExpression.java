package think.chapter13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRegularExpression {
	public static void main(String[] args) {
		
		String input = "abcabcabcdefabc";//输入字符串
		String regex = "(abc)+";//正则表达式
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(input);
		// 通过调用Matcher上的方法，可以判断各种类型的匹配是否成功
		//System.out.println(matcher.matches());//整个input是否匹配正则表达式
		//System.out.println(matcher.lookingAt());//input的开始部分是否匹配正则表达式
		while(matcher.find()){
			System.out.println("匹配 \""+matcher.group()+"\" 在 "+matcher.start()+"-"+(matcher.end()-1));
		}
		
	}
}
