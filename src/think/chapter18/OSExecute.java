package think.chapter18;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OSExecute {
	public static void command(String command) {
		boolean err = false;
		try {
			Process process = new ProcessBuilder(command.split(" ")).start();
			BufferedReader result = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String s;
			while((s = result.readLine()) != null){
				System.out.println(s);
			}
			BufferedReader errors = new BufferedReader(new InputStreamReader(process.getErrorStream()));
			while((s = errors.readLine()) != null){
				System.err.println(s);
				err = true;
			}
		} catch (IOException e) {
			// 兼容Windows 2000，如果不加上 cmd /c 会抛出异常
			if(!command.startsWith("CMD /C")){
				command("CMD /C " + command);
			}else{
				throw new RuntimeException(e);
			}
		}
		if(err){
			throw new OSExecuteException("Errors executing " + command);
		}
	}
	
	public static void main(String[] args) {
		command("CMD /C javap D:/workspace/java-learning/bin/think/chapter18/OSExecute.class");
//		command("ipconfig");
	}
}
