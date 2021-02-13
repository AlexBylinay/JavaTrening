package by.bylinay.javatrening.FileZipper;

import javax.swing.JFileChooser;
import javax.swing.JFileChooser;


public class Delyugy {
	public static void main(String[] args) {
		JFileChooser file = new JFileChooser();
		file.setMultiSelectionEnabled(true);
		file.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
		file.setFileHidingEnabled(false);
		java.io.File f = file.getSelectedFile();
		System.err.println(f.getPath());

	}
	}

