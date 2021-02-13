package by.bylinay.javatrening.FileZipper;

import java.io.File;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.swing.*;
import java.awt.event.*;


	
public class Dubl {
	public static void main(String[] args) {
		// Создаем окно
		JFrame frame = new JFrame("VerticalLayoutTest");
		// Определяем размеры
		frame.setSize(300, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// Создаем панель с менеджером вертикального расположения компонентов
		JPanel contents = new JPanel();
		// Добавим кнопки и текстовое поле в панель
		JButton button = new JButton("Орхивировать файл");
		JButton btnOpenDir = new JButton("Открыть директорию");
		contents.add(button);
		contents.add(btnOpenDir);
		// Размещаем панель в контейнере
		frame.setContentPane(contents);
		// Открываем окно
		frame.setVisible(true);
	}
}