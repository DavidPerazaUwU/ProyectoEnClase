package co.edu.uco.crosscutting.util.text;

import co.edu.uco.crosscutting.util.object.UtilObject;

public class UtilText {
	
	public static final String EMPTY ="";
	private static UtilObject getDefaultObject;
	private UtilText() {	
	}
	
	public static boolean isNull(String value) {
		getUtilObject();
		return UtilObject.isNull(value);
	}
	
	private static void getUtilObject() {
		// TODO Auto-generated method stub
		
	}

	private static String getDefault(String value){
		return getDefaultObject.getDefault(value, EMPTY);
	}
	
	public static String trim(String value) {
		return getDefault(value).trim(); 
	}
}
