package one;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	
	static Add_two_numbers obj1;
	static Add_two_numbers obj2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj1=new Add_two_numbers(10,2);
		obj2=new Add_two_numbers(102,10);

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
		int sum=obj1.add();
		assertEquals(12,sum);
	}
	
	@Test
	public void test2() {
		int sum=obj2.add();
		assertEquals(112,sum);
	}

}
