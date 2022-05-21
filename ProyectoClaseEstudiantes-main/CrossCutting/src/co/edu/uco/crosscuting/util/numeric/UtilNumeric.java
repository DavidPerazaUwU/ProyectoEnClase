package co.edu.uco.crosscuting.util.numeric;

import static co.edu.uco.crosscuting.util.object.UtilObject.getUtilObject;

public class UtilNumeric {
    private static final UtilNumeric INSTANCE = new UtilNumeric();
    private static final Byte ZERO=0;
    private UtilNumeric(){

    }

    public <T extends  Number> T getDefault(T value, T defaultValue){
        return getUtilObject().getDefault(value,defaultValue);
    }

    public <T extends  Number> Number getDefault(T value){
        return getUtilObject().getDefault(value,ZERO);
    }


    public <T extends  Number>boolean isGreaterThan(T oneValue, T twoValue){
        return getUtilObject().getDefault(oneValue,0).doubleValue()
        >
        getUtilObject().getDefault(twoValue,0).doubleValue();

    }
    public <T extends  Number>boolean isLessThan(T oneValue, T twoValue){
        return getUtilObject().getDefault(oneValue,0).doubleValue()
                <
                getUtilObject().getDefault(twoValue,0).doubleValue();

    }
    public <T extends  Number>boolean isEqualsThan(T oneValue, T twoValue){
        return getUtilObject().getDefault(oneValue,0).doubleValue()
                ==
                getUtilObject().getDefault(twoValue,0).doubleValue();

    }
    public <T extends  Number>boolean isGreaterEqualsThan(T oneValue, T twoValue){
        return getUtilObject().getDefault(oneValue,0).doubleValue()
                <=
                getUtilObject().getDefault(twoValue,0).doubleValue();

    }
    public <T extends  Number>boolean isLessEqualsThan(T oneValue, T twoValue){
        return getUtilObject().getDefault(oneValue,0).doubleValue()
                >=
                getUtilObject().getDefault(twoValue,0).doubleValue();

    }
    public <T extends  Number>boolean differentThan(T oneValue, T twoValue){
        return !isEqualsThan(oneValue,twoValue);

    }

    public <T extends Number> boolean isBetween(T value,T initialRange,T finalRange, boolean includeInitialRange, boolean includeFinalRange){
        return includeInitialRange ? isGreaterEqualsThan(value,initialRange): isGreaterThan(value,initialRange)
                &&
                includeFinalRange ? isLessEqualsThan(value,finalRange): isLessThan(value,finalRange);
    }

    public <T extends Number> boolean isBetweenincludeRanges(T value,T initialRange,T finalRange){
        return isBetween(value,initialRange,finalRange,true,true);
    }

    public <T extends Number> boolean isPositive(T value){
        return isGreaterEqualsThan(value,ZERO);
    }
    public <T extends Number> boolean isNegative(T values) {
        return isLessThan(values, ZERO);
    }

}