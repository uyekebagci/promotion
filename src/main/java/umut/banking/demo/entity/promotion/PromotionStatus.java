package umut.banking.demo.entity.promotion;

public enum PromotionStatus {
	GENERAL_PROMOTION("GENERAL_PROMOTION"),
	
	CONVENTION("CONVENTION"),

	AGENT_PROMOTION("AGENT_PROMOTION");
	
	private String shortName;
	
	private PromotionStatus(String shortName) {
		this.shortName = shortName;
	}
	
	public String getShortName() {
		return this.shortName;
	}
	
	public String getLocaleName() {
		return this.shortName;
	}
}