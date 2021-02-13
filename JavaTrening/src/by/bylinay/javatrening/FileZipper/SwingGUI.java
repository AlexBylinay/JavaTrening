package by.bylinay.javatrening.FileZipper;

import java.io.File;
import java.*;
import javax.swing.*;

import javafx.stage.FileChooser;

import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionListener;
import java.awt.peer.ChoicePeer;
import java.awt.event.ActionEvent;
import java.awt.event.*;

import java.awt.event.*;

/**
 * class makes a button, button-starts the process
 * 
 * @param input
 *            - input file you want to archive
 * @param output
 *            - output zipped file
 * @param button
 *            - button to start the archiving process
 * @param btnOpenDir
 *            - button for selecting a file from a directory
 * @param
 * 
 */

public class SwingGUI extends JFrame {

	private static File input = null; 
	 public static String output = "result" + File.separator + "archive.zip";

	private static JButton button = null;
	private static JButton btnOpenDir = null;

	private final String[][] FILTERS = { { "docx", "Файлы Word (*.docx)" }, { "pdf", "Adobe Reader(*.pdf)" } };

	/**
	 * 
	 * makes a button, button-starts the process
	 */

	@SuppressWarnings("deprecation")
	public static void makesButtonMakesAction() {
		// Создаем окно
		JFrame frame = new JFrame("VerticalLayoutTest");
		// Определяем размеры
		frame.setSize(300, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Создаем панель с менеджером вертикального расположения компонентов
		JPanel contents = new JPanel();
		// Добавим кнопки и текстовое поле в панель
		button = new JButton("Орхивировать файл");
		btnOpenDir = new JButton("Открыть файл    ");
		contents.add(button);
		contents.add(btnOpenDir);
		// Размещаем панель в контейнере
		frame.setContentPane(contents);
		// Открываем окно
		frame.setVisible(true);

		btnOpenDir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				JFileChooser chooser = new JFileChooser();
				chooser.setDialogTitle("Выбор файла");
				// Определение режима - только каталог
				chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
				int result = chooser.showOpenDialog(frame);
				// Если директория выбрана, покажем ее в сообщении
				if (result == JFileChooser.APPROVE_OPTION)
					JOptionPane.showMessageDialog(frame, chooser.getSelectedFile());
				 input = chooser.getSelectedFile();
			}
		});
		button.addActionListener(e -> {
			FileZipper.zipFile(input, output);
			});
		
		
	}

}
