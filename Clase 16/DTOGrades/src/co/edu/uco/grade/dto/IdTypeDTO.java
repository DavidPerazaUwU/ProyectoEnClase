package co.edu.uco.grade.dto;

import co.edu.uco.crosscuting.util.text.UtilText;

public class IdTypeDTO {
	
	private int id;
	private String name;

	public IdTypeDTO() {
		super();
		setName(UtilText.EMPTY);
	}

	public IdTypeDTO(int id, String name) {
		super();
		setId(id);
		setName(name);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = UtilText.getDefault(name);	
	}
	
	public List<String> validateName(){
		
		List<String> vaidationMessages = new ArrayList<>();
		
		if(UtilText.isEmpty(getName())) {
			validationMessages.add("Name of id type is required!!");
		}else if(UtilText.getDefault(name.length() > 50){
			validationMessages.add("Lenght of name of id type must be less o equals to 50 characters!!!");
		}else if(UtilText.getDefault(getName()).matches("^[a-zA-ZñÑáÄéËíÍÓ¨´uÚ ]* $")) {
			validationMessages.add("Name of id type contais invalidcharacters!!");
		}
		
	}
}

