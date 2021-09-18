package filesandstreams;

import java.io.*;

public class ByteStreamDemo {
	public static void main(String[] args) {
		try {
			byte bWrite[] = { 11, 21, 3, 40, 5, 65, 97, 101 };
			OutputStream os = new FileOutputStream("test.txt");
			// Writing byte array into FileInputStream
			for (int x = 0; x < bWrite.length; x++) {
				os.write(bWrite[x]); // writes the bytes
			}
			os.close();
			// Opening a file and read data from a stream
			InputStream is = new FileInputStream("test.txt");
			int size = is.available();
			for (int i = 0; i < size; i++) {
				System.out.print((char) is.read() + "  ");
			}
			is.close();
		} catch (IOException e) {
			System.out.print("Exception");
		}
	}
}
