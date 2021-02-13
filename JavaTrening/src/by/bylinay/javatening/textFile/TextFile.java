package by.bylinay.javatening.textFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextFile {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Администратор\\eclipse-workspace\\JavaTrening\\resource\\ManowaR.txt");
		//getLine(file, 3);
		System.out.print(getLine(file, generateNumber(1, countLines(file))));
	}

	public static int countLines(File file) throws IOException {
		int count;
		count = 0;
		BufferedReader br = new BufferedReader(new FileReader(file));
		while (br.readLine() != null) {
			count++;
		}
		br.close();
		return count;
	}

	public static int generateNumber(int start, int bound) {

		return (int) (start + Math.random() * bound);
	}

	public static String getLine(File file, int num) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(file));
		String st = null;
		int count;
		count = 0;
		while (count < num) {
			st = br.readLine();
			count++;

		}
		br.close();
		return st;
	}
}
