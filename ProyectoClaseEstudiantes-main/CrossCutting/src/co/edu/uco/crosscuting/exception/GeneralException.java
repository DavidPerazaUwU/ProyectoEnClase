package co.edu.uco.crosscuting.exception;

import static co.edu.uco.crosscuting.util.object.UtilObject.getUtilObject;
import static co.edu.uco.crosscuting.util.text.UtilText.trim;

import co.edu.uco.crosscuting.util.text.UtilText;

public class GeneralException extends RuntimeException {

	private static final long serialVersionUID = -3695685401858769725L;

	private String userMessage;
	private String technicalMessage;
	private Exception rootException;

	public GeneralException(String userMessage, String technicalMessage, Exception rootException_) {
		super();
		setUserMessage(userMessage);
		setTechnicalMessage(technicalMessage);
		setRootException(rootException);
	}
	public static GeneralException build(String technicalMessage) {
		return new GeneralException(UtilText.EMPTY, technicalMessage, null);
	}

	public String getUserMessage() {
		return userMessage;
	}

	public String getTechnicalMessage() {
		return technicalMessage;
	}

	public Exception getRootException() {
		return rootException;
	}

	private void setUserMessage(String userMessage) {
		this.userMessage = trim(userMessage);
	}

	private void setTechnicalMessage(String technicalMessage) {
		this.technicalMessage = trim(technicalMessage);
	}

	private void setRootException(Exception rootException) {
		this.rootException = getUtilObject().getDefault(rootException, new Exception());
	}

}
