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

	@Test
	public void test() {
		Tcc t = new Tcc();
		String[] from = { "Leslie" };
		String[] to = { "Don Mills" };
		double output = t.calculateTotal(from, to);
		assertEquals("$2.50", output);

	}

}