package simplilearn.prj1;

import java.io.File;

public class ReadFile {

	public void newfile() {
		
		File file = new File("F:\\simplilearn\\folder1");
		String[] files=file.list();{
        for (String string :files) {
        	System.out.println(string);
        }
	}

}
	
		
	}
