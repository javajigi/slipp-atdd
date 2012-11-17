package net.slipp;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class HelloWorldTest {
	@Test
	public void helloworld() {
		HelloWorld hw = new HelloWorld();
		String actual = hw.message();
		assertThat(actual, is("Hello World!"));
	}
}
