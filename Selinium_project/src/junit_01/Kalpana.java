package junit_01;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Kalpana {

	@BeforeClass
	public static void firstmethod() throws Exception {
		System.out.println("hellooo good morning");
	}

	@AfterClass
	public static void lastmethod() throws Exception {
		System.out.println("bye tc");
	}

	@Test
	public void dog() {
		System.out.println("kalpana method 1");
	}
	@Test
	public void apple() {
		System.out.println("kalpana method 2");
	}

}
