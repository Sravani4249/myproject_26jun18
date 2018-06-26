package junit_01;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Junit_file_2 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("hiiii");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("byee");
	}

	@Test
	public void monkey() {
		System.out.println("welcome");
	}
	@Test
	public void ball() {
		System.out.println("good mrng");
	}

}
