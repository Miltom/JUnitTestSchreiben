package test;

import junit.framework.Assert;

import org.junit.Before;

import demo.Demo;
import demo.IMdpJunitDemo;

public class Test {

	private IMdpJunitDemo instance;

	@Before
	public void init() {
		this.instance = new Demo();
	}

	@org.junit.Test
	public void isEmptyTest() {
        Assert.assertEquals(true, this.instance.isEmpty(""));
	}

	@org.junit.Test
	public void capitalizeTest() {
		Assert.assertEquals("Hello" ,this.instance.capitalize("HELLO"));
	}

	@org.junit.Test
	public void reverseTest() {
		Assert.assertEquals("zsH tseT", this.instance.reverse("Test Hsz"));
	}

	@org.junit.Test(expected=NullPointerException.class) 
	public void reverseTest2() {
		this.instance.reverse(null);
	}
	
	@org.junit.Test
	public void joinTest() {
		Assert.assertEquals("a b c d",this.instance.join("a", "b", "c", "d", "e"));
	}
}
