package think.chapter18.practice;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class E01_Scc {
	public static void main(String[] args) {
		Pattern.compile("(?i)\\w+scc\\w+\\.\\w+").matcher("E01_Scc.java");
	}
}
