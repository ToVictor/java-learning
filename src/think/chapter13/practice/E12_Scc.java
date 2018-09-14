package think.chapter13.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class E12_Scc {
	static public final String POEM =
		    "Twas brillig, and the slithy toves\n" +
		    "Did gyre and gimble in the wabe.\n" +
		    "All mimsy were the borogoves,\n" +
		    "And the mome raths outgrabe.\n\n" +
		    "Beware the Jabberwock, my son,\n" +
		    "The jaws that bite, the claws that catch.\n" +
		    "Beware the Jubjub bird, and shun\n" +
		    "The frumious Bandersnatch.";
	public static void main(String[] args) {
		String[] arr = Pattern.compile("\\b").split(POEM);
		Set<String> set = new HashSet<String>();
		for(String s : arr){
			if(s.matches("[a-z]\\w*")){
				set.add(s);
			}
		}
		System.out.println("已大写字母开头的单词数量为："+set.size());
		
		Matcher m = Pattern.compile("[a-z]\\w*").matcher(POEM);
		while(m.find()){
			System.out.println(m.group());
		}
	}
}
