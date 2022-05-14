package co.edu.uco.crosscutting.util.numeric;

import static co.edu.uco.crosscutting.util.object.UtilObject.getUtilObject;

public class UtilNumeric {
	
private static final UtilNumeric INSTANCE = new UtilNumeric();
private static final Byte ZERO = 0;
	
	private UtilNumeric() {
		
	}
	
	public static UtilNumeric getUtilNumeric() {
		return INSTANCE;
	}
	
	public <T extends Number> T getDefault(T value, T defaultValue) {
		return getUtilObject().getDefault(value, defaultValue);
		
	}
	
	public <T extends Number> Number getDefault(T value) {
		return getDefault(value, ZERO);
		
	}
	
	public <T extends Number> boolean isGreatherThan(T firstValue,T secondValue) {
		return getDefault(firstValue).doubleValue() > getDefault(secondValue).doubleValue();
	}
	
	public <T extends Number> boolean isLessThan(T firstValue,T secondValue) {
		return getDefault(firstValue).doubleValue() < getDefault(secondValue).doubleValue();
	}
	
	public <T extends Number> boolean isEqualThan(T firstValue,T secondValue) {
		return getDefault(firstValue).doubleValue() == getDefault(secondValue).doubleValue();
	}
	
	public <T extends Number> boolean isGreatherOrEqualThan(T firstValue,T secondValue) {
		return getDefault(firstValue).doubleValue() >= getDefault(secondValue).doubleValue();
	}
	
	public <T extends Number> boolean isLessOrEqualThan(T firstValue,T secondValue) {
		return getDefault(firstValue).doubleValue() <= getDefault(secondValue).doubleValue();
	}
	
	public <T extends Number> boolean isDifferent(T firstValue,T secondValue) {
		return getDefault(firstValue).doubleValue() != getDefault(secondValue).doubleValue();
	}
	
	public <T extends Number> boolean isBetween(T value, T initialValue, T finalValue, boolean includeinitialValue, boolean includeFinalValue) {
		return includeinitialValue ? isGreatherOrEqualThan(value, initialValue) : isGreatherThan(value, initialValue)
				&&
				includeFinalValue ? isLessOrEqualThan(value, finalValue) : isLessThan(value, finalValue);
 	}
	
	public <T extends Number> boolean isBetweenIncludingRanges(T value, T initialValue, T finalValue) {
		return isBetween(value, initialValue, finalValue, true, true);
 	}
	
	public <T extends Number> boolean isPositive(T value) {
		return isGreatherOrEqualThan(value, ZERO);
 	}
		
}
