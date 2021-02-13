package by.bylinay.javatening.rectangles;

public enum CombinationsEnum {
	LENGTH_WIDTH1WIDTH2(new Circumscriber() {
		
		@Override
		protected Rectangle circumscribe(Rectangle rect1, Rectangle rect2) {
			int width;
			int length = Math.max(rect2.length, rect1.length);
			width = rect1.width + rect2.width;
			return new Rectangle(length, width);
		}
	}), LENGTH1_LENGTH2WIDTH1(new Circumscriber() {
		
		@Override
		protected Rectangle circumscribe(Rectangle rect1, Rectangle rect2) {
			int length = Math.max(rect2.width, rect1.length);
			int width = rect2.length + rect1.width;
			return new Rectangle(length, width);
		}
	}), LENGTH1LENGTH2_WIDTH1(new Circumscriber() {

		@Override
		protected Rectangle circumscribe(Rectangle rect1, Rectangle rect2) {
			int width = Math.max(rect2.width, rect1.width);
			int length = rect1.length + rect2.length;
			return new Rectangle(length, width);
		}
	}), LENGTH1WIDTH2_LENGTH2(new Circumscriber() {

		@Override
		protected Rectangle circumscribe(Rectangle rect1, Rectangle rect2) {
			int length = rect1.length + rect2.width;
			int width = Math.max(rect2.length, rect1.width);
			return new Rectangle(length, width);
		}
	});

	private Circumscriber circumscriber;

	CombinationsEnum(Circumscriber circumscriber) {
		this.circumscriber = circumscriber;
	}

	public Rectangle circumscribe(Rectangle rect1, Rectangle rect2) {
		return circumscriber.circumscribe(rect1, rect2);
	}

	private static abstract class Circumscriber {
		protected abstract Rectangle circumscribe(Rectangle rect1, Rectangle rect2);
	}
}
