package umut.banking.demo.entity.promotion;


public enum PromotionDisplayPhase {
	FIRST_FQ("FIRST_FQ"),
	
	CALENDAR_SHOPPING("CALENDAR_SHOPPING"),

	PAYMENT("PAYMENT");
	
	private String shortName;
	
	private PromotionDisplayPhase(String shortName) {
		this.shortName = shortName;
	}
	
	public String getShortName() {
		return this.shortName;
	}
	
	public String getLocaleName() {
		return this.shortName;
	}
}