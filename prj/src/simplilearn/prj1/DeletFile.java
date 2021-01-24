package simplilearn.prj1;

import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeletFile {




public void delete( String filepath) {
	Path path1 = Paths.get(filepath);
		try {
			Files.delete(path1);
		} catch (NoSuchFileException exce) {
			System.out.println("There is no file!!");
			exce.printStackTrace();
		} catch (DirectoryNotEmptyException directoryNotEmptyException) {
			directoryNotEmptyException.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}

