package junit_01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MySample {

	@Before
	public void setUp() throws Exception {
		System.out.println("hello everyone");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("goodbye freinds");
	}

	@Test
	public void monkey() {
		System.out.println("hii Swarna");
	}
@Test
public void ball() {
	System.out.println("heyyyy");
}
}
