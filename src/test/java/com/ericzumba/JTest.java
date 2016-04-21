package com.ericzumba;

import static com.ericzumba.J.o;
import static org.junit.Assert.*;

import org.junit.Test;

public class JTest {

	@Test
	public void string_object() throws Exception {
		assertEquals("{\"a\": \"b\"}", o("a", "b"));
	}
	
	@Test
	public void integer_object() throws Exception {
		assertEquals("{\"a\": 1}", o("a", 1));
	}
}
