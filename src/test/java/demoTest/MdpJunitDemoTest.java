package demoTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

import demo.IMdpJunitDemo;
import demo.MdpJunitDemo;

public class MdpJunitDemoTest {

	private IMdpJunitDemo instance;

	@Before
	public void init() {
		this.instance = new MdpJunitDemo();
	}

	@Test
	public void isEmptyTest() {
		assertEquals(true, this.instance.isEmpty(""));
		assertEquals(true, this.instance.isEmpty(null));
		assertEquals(false, this.instance.isEmpty("Not Empty"));
	}

	@Test
	public void capitalizeTest() {
		assertEquals("Hello", this.instance.capitalize("HELLO"));
		assertEquals("1234test", this.instance.capitalize("1234TeST"));
		assertEquals("Ab", this.instance.capitalize("aB"));
		assertEquals("A", this.instance.capitalize("a"));
		assertEquals("", this.instance.capitalize(""));
		assertEquals(null, this.instance.capitalize(null));
	}

	@Test(expected = NullPointerException.class)
	public void reverseTest() {
		assertEquals("zsH tseT", this.instance.reverse("Test Hsz"));
		this.instance.reverse(null);
	}

	@Test
	public void joinTest() {
		assertEquals("a b c d e", this.instance.join("a", "b", "c", "d", "e"));
		assertEquals("a b c d  ", this.instance.join("a", "b", "c", "d", " "));
		assertEquals("a", this.instance.join("a"));
		assertEquals("", this.instance.join(""));
		assertNull(this.instance.join(null));
	}
}
