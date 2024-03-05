package four;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	static CountDigits obj1;
	static CountDigits obj2;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		obj1=new CountDigits(12345);
		obj2=new CountDigits(32715216);


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
		int count=obj1.count();
		assertEquals(5,count);
	}
	@Test
	public void test2() {
		int count=obj2.count();
		assertEquals(8,count);
	}

}
