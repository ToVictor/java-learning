package think.chapter18.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.mindview.util.TextFile;

public class E17_Scc {
	public static void main(String[] args) {
		String s = TextFile.read("src/think/chapter18/practice/E17_Scc.java");
		System.out.println(s);
		/*String[] arr = s.split("\\W+");
		Map<Character,Integer> result = new HashMap<Character,Integer>();
		for(String str : arr){
			for(int i=0; i<str.length(); i++){
				Character ch = str.charAt(i);
				Integer count = result.get(ch);
				result.put(ch, count==null ? 1: count+1);
			}
		}
		
		List<Character> keys = new ArrayList<Character>(result.keySet());
		Collections.sort(keys);
		for(Character key : keys){
			System.out.println(key +" => "+ result.get(key));
		}*/
	}
}
