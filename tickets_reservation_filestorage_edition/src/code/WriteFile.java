package code;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteFile {
	public static void writeNewFile(String fileName, String[] headers) throws IOException {
		FileWriter fw = new FileWriter(fileName + ".txt");

		for (String header : headers) {
			fw.append(header);
			if (!headers[headers.length - 1].equals(header)) {
				fw.append(",");
			} else fw.append("\n");
		}
		fw.flush();
		fw.close();
	}
}