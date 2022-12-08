package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;

public class ReadObjFromFile {
	public static void main(String[] args) {
		File file = new File("src\\file\\data.txt");
		try {
			InputStream is = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(is);

			Student st = (Student) ois.readObject();
			System.out.println(st);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
