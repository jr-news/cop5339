/**
 * 
 */
package shoppingCart;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author Seth
 *
 */
public class UserTest {
	
	User user;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		user = new User("username", "password", "type");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link shoppingCart.User#User(java.lang.String, java.lang.String, java.lang.String)}.
	 */
	@Test
	public void testUser() {
		User u = new User("1", "2", "3");
		assertEquals("1", u.getUsername());
		assertEquals("3", u.getType());
		assertTrue(u.checkPassword("2"));
	}

	/**
	 * Test method for {@link shoppingCart.User#getUsername()}.
	 */
	@Test
	public void testGetUsername() {
		assertEquals("username", user.getUsername());
	}

	/**
	 * Test method for {@link shoppingCart.User#getType()}.
	 */
	@Test
	public void testGetType() {
		assertEquals("type", user.getType());
	}

	/**
	 * Test method for {@link shoppingCart.User#checkPassword(java.lang.String)}.
	 */
	@Test
	public void testCheckPassword() {
		assertFalse(user.checkPassword("not"));
		assertTrue(user.checkPassword("password"));
	}
}