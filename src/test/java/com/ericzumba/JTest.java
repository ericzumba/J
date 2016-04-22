package com.ericzumba;

import static com.ericzumba.J.o;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JTest {

	@Test
	public void string_object() throws Exception {
		assertEquals("{\"a\": \"b\"}", o("a", "b").j());
	}
	
	@Test
	public void integer_object() throws Exception {
		assertEquals("{\"a\": 1}", o("a", 1).j());
	}
	
	@Test
	public void boolean_object() throws Exception {
		assertEquals("{\"a\": true}", o("a", true).j());
	}
	
	@Test
	public void string_array_object() throws Exception {
		assertEquals("{\"a\": [\"b\"]}", o("a", asList("b")).j());
	}
	
	@Test
	public void two_string_array_object() throws Exception {
		assertEquals("{\"a\": [\"b\", \"c\"]}", o("a", asList("b", "c")).j());
	}
	
	@Test
	public void float_object() throws Exception {
		assertEquals("{\"a\": 1.23}", o("a", 1.23).j());
	}
	
	@Test
	public void nested_object() throws Exception {
		assertEquals("{\"a\": {\"b\": \"c\"}}", o("a", o("b", "c")).j());
	}
	
	@Test
	public void multiple_object() throws Exception {
		assertEquals("{\"a\": {\"b\": \"c\", \"d\": \"e\"}}", o("a", o("b", "c"), o("d", "e")).j());
	}
	
}
