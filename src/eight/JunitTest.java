package eight;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	static Employee emp;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		emp=new Employee("Alver","Manager",12000);
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void da_test() {
		int da=emp.calculate_da();
		assertEquals(1200,da);
	}

}
