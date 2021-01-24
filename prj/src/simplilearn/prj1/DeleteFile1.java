package simplilearn.prj1;

import java.io.IOException;
import java.net.URI;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DeleteFile1 {

	public void delete() {
		URI filePath = null;
		Path path = Paths.get(filePath);
		try {
			Files.delete(path);
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

