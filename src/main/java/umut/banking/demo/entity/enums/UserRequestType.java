package umut.banking.demo.entity.enums;

public enum UserRequestType {
	
	projectrequest("userrequest.enum.projectrequest"),
	rolerequest("userrequest.enum.rolerequest"),
	otherrequest("userrequest.enum.otherequest");
	
	private String desc;
	
	UserRequestType (String desc){
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
}
