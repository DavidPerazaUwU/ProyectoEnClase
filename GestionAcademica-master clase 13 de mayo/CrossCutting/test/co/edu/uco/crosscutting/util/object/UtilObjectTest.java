package co.edu.uco.crosscutting.util.object;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UtilObjectTest {

	@Test
	void validateIfObjectIsNull() {
		
		// ARRANGE
		
		UtilObject utilobject = UtilObject.getUtilObject();
		Object value = null;
		
		// ACT
		
		boolean result = utilobject.isNull(value);
		
		// ASSERT
		
		assertTrue(result);
	}
	
	@Test
	void validateIfObjectIsNotNull() {
		// Arrange
		UtilObject utilobject = UtilObject.getUtilObject();
		Object value = new Object();
		
		// ACT
		
		boolean result = utilobject.isNull(value);
		
		// ASSERT
		
		assertFalse(result);
	}
	
	@Test
	void validateIfNotNullObjectIsEqualToOriginal() {
		Object value = new Object();
		Object defaultValue = new Object();
		
		Object result = UtilObject.getUtilObject().getDefault(value, defaultValue);
		
		assertTrue(value.equals(result));
		
	}
	
	@Test
	void validateIfObjectIsEqualToDefaultObjectWhenOriginalObjectIsNull() {
		Object value = null;
		Object defaultValue = new Object();
		
		Object result = UtilObject.getUtilObject().getDefault(value, defaultValue);
		
		assertTrue(defaultValue.equals(result));
		
	}

}
