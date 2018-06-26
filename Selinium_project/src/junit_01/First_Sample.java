package junit_01;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;

class First_Sample {

	@Before
	void setUp() throws Exception {
	System.out.println("Hi....welcome" );
	}

	@After
	void tearDown() throws Exception {
		System.out.println("Bye....takecare");
	}

	@Test
	void test() {
		System.out.println("this is test mehtod");
	}
	@Test
	public void test1()
	{
		System.out.println("byeeeeeeeeee");
	}

}
