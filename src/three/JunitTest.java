package three;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {

	static Fibonacci_series obj1;
	static Fibonacci_series obj2;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj1=new Fibonacci_series(5);
		obj2=new Fibonacci_series(10);

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
	public void test1() {
		String values=obj1.print_series();
		assertEquals("0 1 1 2 3",values);
	}
	@Test
	public void test2() {
		String values=obj2.print_series();
		assertEquals("0 1 1 2 3 5 8 13 21 34",values);
	
	}

}
