package co.edu.uco.crosscutting.util.numeric;



public class UtilNumeric {
	
	private static final UtilNumeric INSTANCE = new UtilNumeric();
	private static Byte ZERO = 0
	
	private UtilNumeric(){

	}
	
	public static UtilNumeric getUtilNumeri() {
		return INSTANCE;  
	}
	
	public <T extends Number>T getDefault(T value, T defaultValue){
		return getUtilObject().getDefault(value, defaultvalue);
	}
	
	public <T extends Number>T getDefault(T value, T defaultValue){
		return getDefault(value, ZERO);
	}
	
	public <T extends Number >boolean IsGreaterThan(T oneValue, T twoValue) {
		return getUtilObject().getDefault(oneValue, 0).doubleValue()>getUtilObject().getDefault(twoValue, 0).doubleValue();
	}
	
	public <T extends Number >boolean IsLessThan(T oneValue, T twoValue) {
		return getUtilObject().getDefault(oneValue, 0).doubleValue()<getUtilObject().getDefault(twoValue, 0).doubleValue();
		}
	
	public <T extends Number >boolean IsEqualThan(T oneValue, T twoValue) {
		return getUtilObject().getDefault(oneValue, 0).doubleValue() ==getUtilObject().getDefault(twoValue, 0).doubleValue();
	}
	
	public <T extends Number >boolean IsGreaterOrEqualThan(T oneValue, T twoValue) {
		return isGreaterThan(oneValue, twoValue)|| isEqualThan(oneValue, twoValue);
	}
	
	public <T extends Number >boolean IsLessOrEqualThan(T oneValue, T twoValue) {
		return getDefault(oneValue).doubleValue() <= getDefault(twoValue).doubleValue();
	}

	public <T extends Number >boolean IsDifferentThan(T oneValue, T twoValue) {
		return !isEqualThan(oneValue, twoValue);
	}
	
	public <T extends Number >boolean IsBetween(T value, T initialiRange, T finalRange,
			boolean includeInialRange, boolean includeRFinalRanfe) {
		 return includeInialRange
                ? isGreatherOrEqualThan(value, initialRange)
                : isGreatherThan(value, initialRange)
                &&
                includeFinalRenge
                ?isLessOrEqualThan(value, initialRange);
                :isLessThan(value, finalRange);
	}
}	

	