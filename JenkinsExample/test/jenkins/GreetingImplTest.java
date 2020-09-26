package jenkins;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class GreetingImplTest {
	
	
	private Greeting greeting;

	@Before //This will executes before every test methods
	public void setup() {
		System.out.println("Setup");
		greeting = new GreetingImpl();
		
	}

	@Test
	public void greedShouldReturnAValidOutput() {
		System.out.println("greedShouldReturnAValidOutput");
		String result = greeting.greet("Junit");
		assertNotNull(result);
		assertEquals("Hello Junit", result);
	}

	@Test(expected = IllegalArgumentException.class)
	public void greedShouldThrowAnException_For_NameIsNUll() {
		System.out.println("greedShouldThrowAnException_For_NameIsNUll");
		greeting.greet(null);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void greedShouldThrowAnException_For_NameIsBlank() {
		System.out.println("greedShouldThrowAnException_For_NameIsBlank");
		greeting.greet("");
	}
	
	@After //This will executes after every test methods
	public void teardown() { //For clearing the fields
		System.out.println("Teardown");
		greeting = null;
	}
}
