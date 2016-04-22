package com.ericzumba;

import static java.lang.String.format;
import static java.util.Arrays.asList;
import static java.util.stream.Collectors.joining;

import java.util.Collection;

public class J {

	private final String s;

	private J(String k, String v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}
	
	private J(String k, long v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}

	private J(String k, boolean v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}

	private J(String k, double v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}
	
	private J(String k, J v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}
	
	private J(String k, J... v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}
	
	private J(String k, Collection<? extends Object> v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static String asValue(Object v) {
		if(v instanceof String)
			return format("\"%s\"", v);
		else if(v instanceof Long)
			return format("%d", v);
		else if(v instanceof Boolean)
			return format("%b", v);
		else if(v instanceof Double)
			return format("%.2f", v);
		else if(v instanceof J)
			return format("{%s}", ((J) v).s);
		else if(v instanceof J[]) {
			return format("{%s}", asList((J[]) v).stream().map((j) -> j.s).collect(joining(", ")));
		}
		else if(v instanceof Collection)
			return format("[%s]", ((Collection) v).stream().map(J::asValue).collect(joining(", ")));
		else
			throw new IllegalArgumentException(format("Illegal type value: %s", v));
	}

	public static J o(String k, String v) {
		return new J(k, v);
	}
	
	public static J o(String k, long v) {
		return new J(k, v);
	}
	
	public static J o(String k, boolean v) {
		return new J(k, v);
	}
	
	public static J o(String k, double v) {
		return new J(k, v);
	}
	
	public static J o(String k, J v) {
		return new J(k, v);
	}
	
	public static J o(String k, J... v) {
		return new J(k, v);
	}
	
	public static J o(String k, Collection<? extends Object> v) {
		return new J(k, v);
	}
	
	@Override
	public String toString() {
		return format("{%s}", s);
	}
	
	public String j() {
		return toString();
	}
}
