package by.bylinay.javatening.textFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TexstObderstedy {

	public static void main(String[] args) throws Exception {
		File file = new File("C:\\Users\\Администратор\\eclipse-workspace\\JavaTrening\\resource\\ManowaR.txt");
		System.out.print(getRandomLine(file));
	}

	public static int generateNumber(int number) {
		return (int) (Math.random() * number);
	}

	public static String getRandomLine(File file) throws IOException {
		int num = generateNumber(2000);
		String result = null;

		while (result == null) {
			num = generateNumber(num);
			result = getLine(file, num);
		}
		return result;
	}

	private static String getLine(File file, int num) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(file));
		String result = br.readLine();
		int count = 1;

		while (count < num && result != null) {
			result = br.readLine();
			count++;
		}
		br.close();
		return result;
	}
}