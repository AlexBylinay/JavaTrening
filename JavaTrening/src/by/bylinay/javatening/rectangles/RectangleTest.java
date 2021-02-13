package by.bylinay.javatening.rectangles;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest {
	private Rectangle rectangle;

	@Test
	public void testCheckPassesSimply() throws Exception {
		Rectangle building1 = new Rectangle(9, 1);
		Rectangle building2 = new Rectangle(9, 6);
		Rectangle zone = new Rectangle(9, 7);

		assertTrue(rectangle.solve(building1, building2, zone));
		// assertTrue rectangle.check (building1, building2, zone);

	}

	@Test
	public void testCheckPassesWithTurn() throws Exception {
		Rectangle building1 = new Rectangle(9, 1);
		Rectangle building2 = new Rectangle(4, 9);
		Rectangle zone = new Rectangle(9, 2);

		assertFalse(Rectangle.solve(building1, building2, zone));
		// assertTrue rectangle.check (building1, building2, zone);

	}

	@Test
	public void testCheckPassesOnNegativeZone() throws Exception {
		Rectangle building1 = new Rectangle(9, 1);
		Rectangle building2 = new Rectangle(9, 6);
		Rectangle zone = new Rectangle(9, -7);

		assertFalse(rectangle.solve(building1, building2, zone));
		// assertTrue rectangle.check (building1, building2, zone);
	}

	@Test
	public void testCheckPassesNegativeBuilding() throws Exception {
		Rectangle building1 = new Rectangle(9, 1);
		Rectangle building2 = new Rectangle(-9, 6);
		Rectangle zone = new Rectangle(9, 7);

		assertTrue(rectangle.solve(building1, building2, zone));
		// assertTrue rectangle.check (building1, building2, zone);

	}

	@Test
	public void testCheckPassesNegativeBuildingOnNegativeZone() throws Exception {
		Rectangle building1 = new Rectangle(9, 1);
		Rectangle building2 = new Rectangle(-9, 6);
		Rectangle zone = new Rectangle(9, -7);

		assertFalse(Rectangle.solve(building1, building2, zone));
		// assertTrue (rectangle.check (building1, building2, zone));

	}
}
