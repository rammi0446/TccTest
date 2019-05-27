import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class TccTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
//R1:zone 1
	@Test
	public void testZone1() {
		Tcc t = new Tcc();
		String[] from = { "Leslie" };
		String[] to = { "Don Mills" };
		double output = t.calculateTotal(from, to);
		
		assertEquals("2.5", String.valueOf(output));

	}
	//R2:Zone 2
	@Test
	public void testZone2() {
		Tcc t = new Tcc();
		String[] from = { "Sheppard" };
		String[] to = { "Finch" };
		double output = t.calculateTotal(from, to);
		assertEquals("3.0", String.valueOf(output));

	}
	
	//R3:Zone 3
	@Test
	public void testBetweenZone() {
		Tcc t = new Tcc();
		String[] from = { "Don Mills" };
		String[] to = { "Finch" };
		double output = t.calculateTotal(from, to);
		assertEquals("3.0", String.valueOf(output));

	}
	
	//R3:Zone 3
		@Test
		public void testTrip() {
			Tcc t = new Tcc();
			//First trip
			String[] from1 = { "Finch" };
			String[] to1 = { "Sheppard" };
			double output1 = t.calculateTotal(from1, to1);
			assertEquals("3.0", String.valueOf(output1));
			//trip two
			String[] from2 = { "Leslie" };
			String[] to2 = { "Don Mills" };
			double output2 = t.calculateTotal(from2, to2);
			assertEquals("2.5", String.valueOf(output2));
			//total cost
			double total = output1 + output2;
			assertEquals(5.50, total);

		}

}
