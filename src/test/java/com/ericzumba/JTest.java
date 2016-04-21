package com.ericzumba;

import static org.junit.Assert.*;

import org.junit.Test;

public class JTest {

	@Test
	public void tests() throws Exception {
		assertEquals("{\"a\": \"b\"}", J.o("a", "b"));
	}
}
