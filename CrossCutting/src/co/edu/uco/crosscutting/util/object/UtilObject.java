package co.edu.uco.crosscutting.util.object;

public class UtilObject {
	
	private static UtilObject INSTANCE = new UtilObject();
	
	private UtilObject(){

	}
	
	public UtilObject getUtilObject() {
		return INSTANCE;  
	}
	
	public static <T> boolean isNull(T object ) {
		return object == null;
	}

	public <T> T getDefault(T object, T defaultValue) {
		return isNull(object) ? defaultValue : object;
	}
}
