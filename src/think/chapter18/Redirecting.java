package think.chapter18;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Redirecting {
	public static void main(String[] args) throws IOException {
		PrintStream console = System.out;
		BufferedInputStream in = new BufferedInputStream(new FileInputStream("src/think/chapter18/Redirecting.java"));
		PrintStream out = new PrintStream(new FileOutputStream("test.out"));
		System.setIn(in);
		System.setOut(out);
		System.setErr(out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		while((s=br.readLine()) != null){
			System.out.println(s);
			if(s.contains("public")){
				throw new RuntimeException("测试异常……");
			}
		}
		out.close();
		System.setOut(console);
	}
}
