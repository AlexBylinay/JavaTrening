package by.bylinay.javatrening.FileZipper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import javax.swing.*;

public class Dubl2 {

	public static void main(String[] args) {

		JFrame frame = new JFrame("My First GUI");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		JButton button1 = new JButton("Press");
		frame.getContentPane().add(button1);
		frame.setVisible(true);
		button1.addActionListener(e -> {
			try {
				// *входной
				FileInputStream in = null;
				in = new FileInputStream("resource" + File.separator + "Futurama.mp4");

				// выходной
				ZipOutputStream out = null;
				out = new ZipOutputStream(new FileOutputStream("result" + File.separator + "archive.zip"));

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
			} catch (IOException ex) {
				ex.printStackTrace();
			}
			System.out.println("vsio pashit!");
		});

	}
}
