package file;

import java.io.File;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

public class WriteStringToFile {
	public static void main(String[] args) {
		File f = new File("src\\file\\text.txt");
		try {
			PrintWriter pw = new PrintWriter(f, StandardCharsets.UTF_8);
			pw.println("Test write data to file");
			pw.print("Hello World 1234");
			pw.print("Hello World 1234");
			pw.flush();
			pw.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
//		System.out.println(f.getAbsolutePath());
//		System.out.println(f.getPath());
	}
}
