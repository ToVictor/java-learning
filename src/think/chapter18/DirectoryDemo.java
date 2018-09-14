package think.chapter18;

import java.io.File;
import java.io.IOException;

import net.mindview.util.PPrint;

public class DirectoryDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("E:/SoftData/BaiduNetdiskDownload/..");
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
	}
}
