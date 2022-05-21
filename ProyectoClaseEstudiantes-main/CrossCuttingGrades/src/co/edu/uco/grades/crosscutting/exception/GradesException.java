package co.edu.uco.grades.crosscutting.exception;

import co.edu.uco.crosscuting.exception.GeneralException;
import static co.edu.uco.crosscuting.util.object.UtilObject.getUtilObject;
import co.edu.uco.grades.crosscutting.exception.enumeracion.ExceptionLocation;
import co.edu.uco.grades.crosscutting.exception.enumeracion.ExceptionType;

public class GradesException extends GeneralException {

	private static final long serialVersionUID = -6398229720185593923L;
	private ExceptionType type;
	private ExceptionLocation location;

	private GradesException(String userMessage, String technicalMessage, Exception rootException_, ExceptionType type,
			ExceptionLocation location) {
		super(userMessage, technicalMessage, rootException_);
		setType(type);
		setLocation(location);
	}

	public static GradesException buildUserException(String userMessage) {
		return new GradesException(userMessage, userMessage, null, null, null);
	}

	public static GradesException buildTechnicalMessage(String technicalMessage) {
		return new GradesException(null, technicalMessage, null, null, null);
	}
	public static GradesException build(String userMessage, String technicalMessage_) {
		return new GradesException(userMessage, technicalMessage_, null, null, null);
	}

	public static GradesException build(String userMessage, Exception rootException_) {
		return new GradesException(userMessage, userMessage, rootException_, null, null);
	}

	private void setType(ExceptionType type) {
		this.type = getUtilObject().getDefault(type, ExceptionType.GENERAL);
	}

	private void setLocation(ExceptionLocation location) {
		this.location = getUtilObject().getDefault(location, ExceptionLocation.GENERAL);
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public ExceptionType getType() {
		return type;
	}

	public ExceptionLocation getLocation() {
		return location;
	}

}
