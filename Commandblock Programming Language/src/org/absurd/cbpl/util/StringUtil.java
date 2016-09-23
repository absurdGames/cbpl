package org.absurd.cbpl.util;

public class StringUtil {
	public static String escape(String content) {
		return content.replace("\\","\\\\").replace("\"","\\\"");
	}
	public static String unescape(String content) {
		return content.replace("\\\"","\"").replace("\\\\","\\");
	}
}
