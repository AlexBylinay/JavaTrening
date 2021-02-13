package by.bylinay.javatrening.FileZipper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * class archives the file to the directory
 * 
 * @author Администратор
 *
 */
public abstract class FileZipper implements Runnable {
	// void Thread(Runnable threadObj, String threadName) {
	// }

	/**
	 * starts archiving on a separate thread
	 * 
	 * @param input
	 * @param output
	 */
	public static void zipFile(File input, String output) {
		new Thread(new Runnable() {
			@Override
			public void run() {
				doZip(input, output);
			}
		}).start();

	}
	static boolean doZip (String input, String output) {
		return false;
		
	}
	/**
	 * directly makes a archiving of the file
	 * 
	 * @param input - input file you want to archive
	 * @param output - output zipped file
	 */
	@SuppressWarnings("unused")
	static boolean doZip(File input, String output) {
		// *входной
		FileInputStream in = null;
		// выходной
		ZipOutputStream out = null;

		try {
			in = new FileInputStream(input);
			out = new ZipOutputStream(new FileOutputStream(output));

			// файл внутри zip-файла
			out.putNextEntry(new ZipEntry("zippedjava.docx"));

			// размер
			byte[] b = new byte[1024];
			int count;

			while ((count = in.read(b)) > 0) {
				out.write(b, 0, count);
			}
			out.close();
			in.close();
			
			

			System.out.println( "done");
		
			if (out == null) {
				return true;}
		}

		catch (IOException e) {
			e.printStackTrace();
		}
		return false;
		
	}

}
