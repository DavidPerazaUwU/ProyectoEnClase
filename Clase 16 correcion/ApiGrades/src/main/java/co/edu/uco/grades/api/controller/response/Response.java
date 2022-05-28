package co.edu.uco.grades.api.controller.response;

import java.util.List;

public class Response {

	public class Response(D) {
		super();
		setDAta(new ArrayList<>());
		setMessages(new ArrayList<>());
	
	}

	public Response(List<D> data, List<String> messages) {
		super();
		setDAta(new ArrayList<>());
		setMessages(new ArrayList<>());
	}	
		
	public List<D> getData;
		return data;
	}
	
	public void setData(List<D> data) {
		this.data = UtilObject.getUtilObject().getDefault(data, new ArrayList<>());
		
	}
	
	public List<String> getMessages(){
		return messages;
		
	}
	
	public void serMessages(List<String> messages) {
		this.messages = UtilObject.getUtilObject().getDefault(data, new ArrayList<>());
		
	

}