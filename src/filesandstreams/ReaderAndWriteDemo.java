package filesandstreams;

import java.io.*;

public class ReaderAndWriteDemo {
	public static void main(String[] args) throws IOException {
		try {
			// Creating FileReader object
			// Assuming that you have a file at below specified path
			File file = new File("E:/FIleExamples/SampleText.txt");
			FileReader reader = new FileReader(file);
			char chars[] = new char[(int) file.length()];
			// Reading data from the file
			reader.read(chars);// by using this statment the data will store in chars array

			// Writing data to another file at specifed path like below
			File out = new File("E:/FIleExamples/SampleText2.txt");
			FileWriter writer = new FileWriter(out);
			// Writing data to the file
			writer.write(chars);
			writer.flush();
			System.out.println("Data successfully written to the specified file");
		} catch (IOException e) {
			System.out.print("Exception" + e.getMessage());
		}
	}
}
