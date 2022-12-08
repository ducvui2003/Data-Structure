package file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class WriteObjToFile {
	public static void main(String[] args) {
		File file = new File("src\\file\\data.txt");
		try {
			OutputStream os = new FileOutputStream(file);//Convert to Byte, save it into file. But can't support save Obj
			ObjectOutputStream oos = new ObjectOutputStream(os); //Save Obj to file in outputStream

			Student st1 = new Student(21130320, "Le Anh Duc", "15/08/2003", "CNTT");
			Student st2 = new Student(21130320, "Le Anh Duc", "15/08/2003", "CNTT");

			oos.writeObject(st1);

			oos.flush();//push
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
