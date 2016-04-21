package com.ericzumba;

import static java.lang.String.format;

public class J {

	public final String s;

	private J(String k, String v) {
		this.s = format("{\"%s\": \"%s\"}", k, v);
	}
	
	private J(String k, long v) {
		this.s = format("{\"%s\": %d}", k, v);
	}

	private J(String k, boolean v) {
		this.s = format("{\"%s\": %b}", k, v);
	}

	private J(String k, double v) {
		this.s = format("{\"%s\": %.2f}", k, v);
	}
	
	public J(String k, J v) {
		this.s = format("{\"%s\": %s}", k, v);
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
	
	@Override
	public String toString() {
		return this.s;
	}
}
