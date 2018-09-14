package think.chapter18;

import java.io.PrintWriter;

public class ChangeSystemOut {
	public static void main(String[] args) {
		//PrintWriter构造方法的第二个参数表示是否开启自动刷新
		PrintWriter out = new PrintWriter(System.out,true);
		out.println("Hello,World");
//		out.flush();
	}
}
