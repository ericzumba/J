package com.ericzumba;

import static java.lang.String.format;

public class J {

	public static String o(String k, String v) {
		return format("{\"%s\": \"%s\"}", k, v);
	}

	public static String o(String k, long v) {
		return format("{\"%s\": %d}", k, v);
	}

	public static String o(String k, boolean v) {
		return format("{\"%s\": %b}", k, v);
	}

	public static Object o(String k, double v) {
		return format("{\"%s\": %.2f}", k, v);
	}

}
