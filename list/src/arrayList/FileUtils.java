package arrayList;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Iterator;

public class FileUtils {
	public static ArrayList<String> readFile(String url) {
		ArrayList<String> result = new ArrayList<String>();
		File file = new File(url);

		try {
//			Read
			FileReader reader = new FileReader(file);
//			Space to stored Read data
			BufferedReader buffer = new BufferedReader(reader);
			String line = buffer.readLine();
			while (line != null) {
				result.add(line+"\n");
				line = buffer.readLine();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return result;
	}

	public static void main(String[] args) {
		System.out.println(readFile("src\\arrayList\\data.txt"));
	}
}
