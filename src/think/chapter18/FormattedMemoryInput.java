package think.chapter18;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FormattedMemoryInput {
	public static void main(String[] args) throws IOException {
		/*DataInputStream in = new DataInputStream(new FileInputStream("src/think/chapter18/data.txt"));
		DataInputStream in = new DataInputStream(new ByteArrayInputStream(BufferedInputFile.read("src/think/chapter18/data.txt").getBytes()));
		while(in.available() != 0){
			System.out.println((char)in.read());
		}
		System.out.println(in.readInt());
		System.out.println(in.readUTF());
		System.out.println(in.readDouble());
		in.close();*/
		
		System.out.println(BufferedInputFile.read("src/think/chapter18/data.txt").getBytes().length);
	}
}
