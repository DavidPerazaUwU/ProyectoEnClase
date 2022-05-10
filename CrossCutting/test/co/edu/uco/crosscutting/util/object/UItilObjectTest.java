package co.edu.uco.crosscutting.util.object;

import org.junit.jupiter.api.Test;

class UItilObjectTest {

	
	@Test
	void validateIfObjectIsNull() {
		//Arrange
		Object value = null;
		
		//Act
		boolean result = UtilObject.isNull(value);
		
		//Assert
		asserTrue(result);
	}

	private void asserTrue(boolean result) {
		// TODO Auto-generated method stub
		
	}

	@Test
	void validateIfObjectIsNotNull() {
		//Arrange
		Object value = new Object();
		
		//Act
		boolean result = UtilObject.isNull(value);
		
		//Assert
		asserFalse(result);
	
	}

	private void asserFalse(boolean result) {
		// TODO Auto-generated method stub
		
	}
	@Test
	void validateIfNotNullObjectIsEqualToOriginal() {
		//Arrange
		Object value = new Object();
		Object defaultValue = new Object();
		
		//Act
		Object result = UtilObject.getUtilObject().getDefault(value,defaultValue);
		
		//Assert
		asserTrue(value.equals(result));

	}
	@Test
	void validateIfObjectIsEqualToDefaulObjectWhenOriginalObjectIsNull() {
		//Arrange
		Object value = null;
		Object defaultValue = new Object();
		
		//Act
		Object result = UtilObject.getUtilObject().getDefault(value,defaultValue);
		
		//Assert
		asserTrue(defaultValue.equals(result));

	}
}
