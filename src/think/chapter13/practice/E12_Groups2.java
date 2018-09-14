package think.chapter13.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import think.chapter13.Groups;

public class E12_Groups2 {
	public static void main(String[] args) {
		Set<String> words = new HashSet<String>();
		Matcher m = Pattern.compile("\\b((?![A-Z])\\w+)\\b").matcher(Groups.POEM);
//		Matcher m = Pattern.compile("\\b([a-z]\\w+)\\b").matcher(Groups.POEM);
		while(m.find()){
			words.add(m.group(1));
			for(int j=0; j<=m.groupCount(); j++){
				System.out.print("["+m.group(j)+"]	");
			}
			System.out.println();
		}
		System.out.println("-------------------");
		System.out.println("Size = "+words.size());
		System.out.println(words.toString());
	}
}
