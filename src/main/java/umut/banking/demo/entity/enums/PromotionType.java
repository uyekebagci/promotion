package umut.banking.demo.entity.enums;

public enum PromotionType
{
	GENERAL_PROMOTION("GENERAL_PROMOTION"),
	
	CONVENTION("CONVENTION"),

	AGENT_PROMOTION("AGENT_PROMOTION"),
	
	AWARD_TICKET("AWARD_TICKET"),

	THIRD_PARTY_PROMOTION("THIRD_PARTY_PROMOTION");
	
	private String shortName;
	
	private PromotionType(String shortName) {
		this.shortName = shortName;
	}
	
	public String getShortName() {
		return this.shortName;
	}
	
	public String getLocaleName() {
		return this.shortName;
	}
}