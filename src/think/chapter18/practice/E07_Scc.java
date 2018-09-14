package think.chapter18.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class E07_Scc {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("src/think/chapter18/practice/E07_Scc.java"));
		LinkedList<String> list = new LinkedList<>();
		String s;
		while((s = in.readLine()) != null){
			list.addFirst(s);
		}
		in.close();
		for(String str : list){
			System.out.println(str);
		}
	}
}
