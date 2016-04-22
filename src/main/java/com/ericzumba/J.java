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
	
	public static String asValue(String v) {
		return format("\"%s\"", v);
	}
	
	private J(String k, long v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}

	public static String asValue(long v) {
		return format("%d", v);
	}
	
	private J(String k, boolean v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}

	public static String asValue(boolean v) {
		return format("%b", v);
	}
	
	private J(String k, double v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}
	
	public static String asValue(double v) {
		return format("%.2f", v);
	}
	
	public J(String k, J v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}
	
	public static String asValue(J v) {
		return format("{%s}", v.s);
	}
	
	public J(String k, J... v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}
	
	public static String asValue(J... v) {
		return format("{%s}", asList(v).stream().map((j) -> j.s).collect(joining(", ")));
	}

	public J(String k, Collection<? extends String> v) {
		this.s = format("\"%s\": %s", k, asValue(v));
	}
	
	public static String asValue(Collection<? extends String> v) {
		return format("[%s]", v.stream().map(J::asValue).collect(joining(", ")));
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
	
	public static J o(String k, Collection<? extends String> v) {
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
