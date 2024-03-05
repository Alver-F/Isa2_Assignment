package seven;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitTest {
	static Dog d1;
	static Dog d2;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		d1=new Dog("Spike","Lab");
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
	public void test() {
		String name,breed;
		name=d1.display_name();
		assertEquals("Spike",name);
		
		d1.setvalues("Spikey","Labrador Retriever");
		
		breed=d1.display_breed();
		assertEquals("Labrador Retriever",breed);
		
	}

}
