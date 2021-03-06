package com.ericzumba;

import static com.ericzumba.J.o;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;

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
	public void two_integer_array_object() throws Exception {
		assertEquals("{\"a\": [\"1\", \"2\"]}", o("a", asList("1", "2")).j());
	}
	
	@Test
	public void nested_array_object() throws Exception {
		assertEquals("{\"a\": [{\"b\": \"c\"}, {\"d\": \"e\"}]}", o("a", asList(o("b", "c"), o("d", "e"))).j());
	}
	
	@Test
	public void float_object() throws Exception {
		assertEquals("{\"a\": 1.23}", o("a", 1.23).j());
	}
	
	@Test
	public void big_decimal_object() throws Exception {
		assertEquals("{\"a\": 1.23456}", o("a", new BigDecimal("1.23456")).j());
	}
	
	@Test
	public void nested_object() throws Exception {
		assertEquals("{\"a\": {\"b\": \"c\"}}", o("a", o("b", "c")).j());
	}
	
	@Test
	public void multiple_key_value_pairs() throws Exception {
		assertEquals("{\"a\": \"b\", \"c\": \"d\"}", o("a", "b").and(o("c", "d")).j());
	}
	
	@Test
	public void multiple_nested_objects() throws Exception {
		assertEquals("{\"a\": {\"b\": \"c\", \"d\": \"e\"}}", o("a", o("b", "c").and(o("d", "e"))).j());
	}
	
}
