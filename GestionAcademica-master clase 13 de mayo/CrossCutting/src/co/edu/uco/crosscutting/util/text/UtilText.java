package co.edu.uco.crosscutting.util.text;

import static co.edu.uco.crosscutting.util.object.UtilObject.getUtilObject;

public class UtilText {
	
	public static final String EMPTY = "";
	
	private UtilText() {
	}
	
	public static boolean isNull(String value) {
		return getUtilObject().isNull(value);
	}
	
	public static String getDefault(String value, String defaultValue) {
		return getUtilObject().getDefault(value, defaultValue);
	}
	public static String getDefault(String value) {
		return getUtilObject().getDefault(value, EMPTY);
	}
	
	public static String trim(String value) {
		return getDefault(value).trim();
	}
}
