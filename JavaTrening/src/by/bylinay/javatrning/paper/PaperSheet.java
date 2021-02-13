package by.bylinay.javatrning.paper;

import java.util.Stack;

public class PaperSheet {
	
	double height;
	double width;
	Stack<Boolean> foldingHistory;
	
	public PaperSheet(int height, int width) {
		this.height = height;
		this.width = width;
		rotateIfNeeded();
		foldingHistory = new Stack<Boolean>();
	}

	public static void main(String[] arr) {
		PaperSheet sheet1 = new PaperSheet(298, 210);
		PaperSheet sheet2 = new PaperSheet(200, 100);
		PaperSheet sheet3 = new PaperSheet(80, 80);
		System.out.println(sheet1.getSquare());
		System.out.println(sheet2.getSquare());
		System.out.println(sheet3.getSquare());
		sheet1.foldInHalf();
		sheet2.foldInHalf();
		sheet3.foldInHalf();
		System.out.println(sheet1.getSquare());
		System.out.println(sheet2.getSquare());
		System.out.println(sheet3.getSquare());
		sheet1.unfoldSheet();
		sheet2.unfoldSheet();
		sheet3.unfoldSheet();
		System.out.println(sheet1.getSquare());
		System.out.println(sheet2.getSquare());
		System.out.println(sheet3.getSquare());
	}



	public void foldInHalf() {
		height /= 2;
		foldingHistory.push(rotateIfNeeded());
	}

	private boolean rotateIfNeeded() {
		if (height < width) {
			double oldheight = height;
			height = width;
			width = oldheight;
			return true;
		}
		return false;

	}

	public double getSquare() {
		return height * width;

	}

	public void unfoldSheet() {
		if (foldingHistory.empty())
			return;
		if (foldingHistory.pop())
			width *= 2;
		else
			height *= 2;
	}

}
