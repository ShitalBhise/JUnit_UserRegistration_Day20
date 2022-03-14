package junit;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class UserRegJunit {
	UserRegistration j = new UserRegistration();

	@Test
	public void test() {
		boolean result = j.FirstName("Shital");

		assertTrue(result);

	}

	
	@Test
	public void testLastName() {
		boolean result = j.LastName("bhisE");

		asassertTrue(result);

	}


	private void asassertTrue(boolean result) {
		// TODO Auto-generated method stub
		
	}
	
}
