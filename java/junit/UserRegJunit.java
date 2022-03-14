package junit;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class UserRegJunit {
	UserRegistration j = new UserRegistration();
	
	@Test
	public void test() {
boolean result = j.FirstName("Shital...");
		
		assertEquals(true, result);
	
	}

}
