package testPages;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles {

	public static void main(String[] args) {
		readFileFileReader("./inputFiles/cityFile.city");
		System.out.println("system processed");
		
		char a = '1';
		System.out.println((int)a);
	
	}

	public static void readTextFileBufferedReader(String path) throws Exception {
		try {
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			System.out.println("File Not Found");
		}

	}

	public static void readFileFileReader(String path) {
		FileReader fileReader;
		try {
			fileReader = new FileReader(path);
			int i;
			while ((i = fileReader.read()) != -1)
				;
			System.out.println((char) i);

			System.out.println();
		} catch (FileNotFoundException eFileNotFoundException) {
			System.out.println("File Not Found");
		} catch (IOException e) {
			System.out.println("Input OPutput Exception");

		}
	}
}
