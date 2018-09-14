package think.chapter13.practice;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.mindview.util.TextFile;

public class E16_Scc {
	public static void main(String[] args) {
		if(args.length < 2) {
//			   System.out.println("Usage: java JGrep file regex");
//			   System.exit(0);
				args = new String[2];
//				args[0] = "src/think/chapter13/practice";
				args[0] = "src/think/chapter13/practice/E16_Scc.java";
				args[1] = "\\b[s]\\w+";
			 }
			 Pattern p = Pattern.compile(args[1]);
			 Matcher m = p.matcher("");
			 grepFile(m, args[0]);
	}
	
	static void grepFile(Matcher m, String fileAbsolutePath){
		System.out.println("File："+fileAbsolutePath);
		File file = new File(fileAbsolutePath);
		if(file.exists()){
			if(file.isFile()){
				int index = 0;
				for(String line : new TextFile(file.getAbsolutePath())) {
				   m.reset(line);
				   while(m.find())
				     System.out.println(index++ + ": " +
				       m.group() + ": " + m.start());
				 }
			}else{
				File[] fileArr = file.listFiles();
				for(File f : fileArr){
					grepFile(m, f.getAbsolutePath());
				}
			}
		}
	}
}
