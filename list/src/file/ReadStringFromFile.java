package file;

import java.io.BufferedReader;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class ReadStringFromFile {
	public static void main(String[] args) {
		File f = new File("src\\file\\text.txt");
//		Cach 1
		try {
			BufferedReader bufferedReader = Files.newBufferedReader(f.toPath(), StandardCharsets.UTF_8);
			String line = null;
//			Pause read data
			while (true) {
				line = bufferedReader.readLine();
				if (line == null) {
					break;
				} else {
					System.out.println(line);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

//		Cach 2
		try {
			List<String> allText = Files.readAllLines(f.toPath(), StandardCharsets.UTF_8);
			for (String line : allText) {
				System.out.println(line);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
