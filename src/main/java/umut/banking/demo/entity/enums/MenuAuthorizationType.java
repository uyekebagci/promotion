package umut.banking.demo.entity.enums;

public enum MenuAuthorizationType {
	
	protecteduser("Protected"),
	privateuser("Private");// her kullanici için özel yetkilendirme
	//projeye login olabilmiş kullanicilara açik.
	
	private String desc;
	
	MenuAuthorizationType (String desc){
		this.desc = desc;
	}

	public String getDesc() {
		return desc;
	}
	
}
