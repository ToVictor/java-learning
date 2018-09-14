package think.chapter13.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E10_Scc {
	public static void main(String[] args) {
		String inputStr = "Java now has regular expression";
		System.out.println(inputStr.length());
		List<String> regexs = new ArrayList<String>();
		regexs.add("^Java");
		regexs.add("\\Breg.*");
		regexs.add("n.w\\s+h(a|i)s");
		regexs.add("s?");
		regexs.add("s*");
		regexs.add("s+");
		regexs.add("s{4}");
		regexs.add("s{1}.");
		regexs.add("s{0,3}");
		
		for(String regex : regexs){
			System.out.println("Regular expression : \"" + regex + "\"");
			Pattern p = Pattern.compile(regex);
			Matcher m = p.matcher(inputStr);
			while(m.find()){
				System.out.println("Match \""+m.group()+"\" at positions "+m.start()+"-"+(m.end()-1));
			}
			System.out.println("------------------------------------------");
		}
		
	}
}
