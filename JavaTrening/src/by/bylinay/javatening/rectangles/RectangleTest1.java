package by.bylinay.javatening.rectangles;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class RectangleTest1 {
	private Rectangle rectangle;

	@Test
	public void testCheck() throws Exception {
		Rectangle building1 = new Rectangle(9, 1);
		Rectangle building2 = new Rectangle(9, 6);
		Rectangle zone = new Rectangle(9, 7);
		

		assertTrue ( rectangle.solve(building1, building2, zone));
		// val = rectangle.check (building1, building2, zone);
		
	}

}
