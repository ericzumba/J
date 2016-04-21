package com.ericzumba;

import static java.lang.String.format;

public class J {

	public static String o(String k, String v) {
		return format("{\"%s\": \"%s\"}", k, v);
	}

	public static String o(String k, long v) {
		return format("{\"%s\": %d}", k, v);
	}

}
