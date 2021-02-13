package by.bylinay.javatening.rectangles;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RectangleTest4 {
private Rectangle rectangle;

	
	@Test
	public void testCheck()throws Exception  {
		Rectangle building1 = new Rectangle(9, 1);
        Rectangle building2 = new Rectangle(9, 6);
        Rectangle zone = new Rectangle(3, 7);
        boolean ans = true;
        boolean val;
		
		val = rectangle.solve (building1, building2, zone);
		// val = rectangle.check (building1, building2, zone);
		 assertEquals(ans, val);
	}

}
 
