package co.edu.uco.crosscutting.util.numeric;

import co.edu.uco.crosscutting.util.object.UtilObject;

public class UtilNumeric {
    private static final UtilNumeric INSTANCE = new UtilNumeric();
    private static final Byte ZERO = 0

    private UtilNumeric(){
    }

    public static UtilNumeric getUtilNumeric(){
        return INSTANCE;
    }

    public <T extends Number> T getDefault(T value, T defaulValue){
        return getUtilObeject().getDefault(value, defaultValue);
    }

    public <T extends Number> Number getDefault(T value, T defaulValue){
        return getDefault(value, ZERO);
    }

    public <T extends Number> boolean isGreatherThan(T oneValue, T twoValue) {
        return getUtilObject().getDefault(oneValue, 0).doubleValue()
                > getUtilObejct().getDefault(twoValue,0).doubleValue();
    }

    public <T extends Number> boolean isLessThan(T oneValue, T twoValue) {
        return getUtilObject().getDefault(oneValue, 0).doubleValue()
                < getUtilObejct().getDefault(twoValue,0).doubleValue();
    }

    public <T extends Number> boolean isEqualThan(T oneValue, T twoValue){
        return getUtilNumeric().getDefault(oneValue, 0).doubleValue()
                == getUtilObejct().getDefault(twoValue,0).doubleValue();
    }

    public <T extends Number> boolean isGreatherOrEqualThan(T oneValue, T twoValue){
        return isGreatherThan(oneValue,twoValue) || isEqualThan(oneValue,twoValue);
    }

    public <T extends Number> boolean isLessOrEqualThan(T oneValue, T twoValue){
        return getDefault(oneValue,twoValue).doubleValue() <= getDefault(oneValue,twoValue);
    }

    public <T extends Number> boolean isDifferentThan(T oneValue, T twoValue){
        return !isEqualThan(oneValue,twoValue);
    }

    public<T extends Number> boolean isBetween(T Value, T initialRange, T finalRange, boolean includeInialRange, boolean includeFinalRenge){
        if(includeFinalRenge){
            if (includeFinalRenge){
                return isGreatherThan()
            }



        return includeInialRange
                ? isGreatherOrEqualThan(value, initialRange)
                : isGreatherThan(value, initialRange)
                &&
                includeFinalRenge
                ?isLessOrEqualThan(value, initialRange);
                :isLessThan(value, finalRange);


    }
    public<T extends Number> boolean isBetweeIncluideRange(T Value, T initialRange, T finalRange) {
        return isBetween(value, initialRange, finalRange, true, true);
    }

    public<T extends Number> boolean isPositive(T Value) {
        return  isGreatherOrEqualThan(value, ZERO);
    }

    public<T extends Number> boolean isNegative(T Value){
        return  isPositive(value);
    }


    }
}
