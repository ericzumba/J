package com.ericzumba;

import static com.ericzumba.J.o;
import static org.junit.Assert.*;

import org.junit.Test;

public class JTest {

	@Test
	public void string_object() throws Exception {
		assertEquals("{\"a\": \"b\"}", o("a", "b").toString());
	}
	
	@Test
	public void integer_object() throws Exception {
		assertEquals("{\"a\": 1}", o("a", 1).toString());
	}
	
	@Test
	public void boolean_object() throws Exception {
		assertEquals("{\"a\": true}", o("a", true).toString());
	}
	
	@Test
	public void float_object() throws Exception {
		assertEquals("{\"a\": 1.23}", o("a", 1.23).toString());
	}
	
	@Test
	public void nested_object() throws Exception {
		assertEquals("{\"a\": {\"b\": \"c\"}}", o("a", o("b", "c")).toString());
	}
	
	@Test
	public void multiple_object() throws Exception {
		assertEquals("{\"a\": {\"b\": \"c\", \"d\": \"e\"}}", o("a", o("b", "c"), o("d", "e")).toString());
	}
	
}
