package umut.banking.demo.entity.promotion;



import org.hibernate.annotations.JdbcTypeCode;
import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;
import jakarta.validation.constraints.NotNull;

import java.sql.Types;

/**
 * 
 * @author B_YAPICIOGLU
 */

@Entity
@Table(name = "DFM_PROMO_DESC")
public class PromotionDescription extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_Promo_Desc_SEQ", allocationSize = 1, initialValue = 1)
	private Long id;

	@Column(name = "CHANNEL_CODE", length = 255)
	private String channelCode;
	
	@Basic(optional = false)
	@NotNull
	@JdbcTypeCode(Types.LONGNVARCHAR)
	@Column(name = "DESCRIPTION", length = 2500)
	private String description;

	@Basic(optional = false)
	@NotNull
	@Column(name = "LANGUAGE_CODE", length = 255)
	private String languageCode;
	
	@Column(name = "REFER_TO", length = 500)
	private String referTo;
	@Lob
	@Column(name = "TERMS_COND")
	private String termsCond;
	
	@Column(name = "LOCATION_NAME", length = 200)
	private String locationName;

	@Column(name = "CAMPAIGN_NAME", length = 2500)
	private String campaignName;

	@Column(name = "PROMO_ID")
	private Long promoId;
	@Column(name = "DISPLAY_PHASE", length = 200)
	@Enumerated(EnumType.STRING)
	private PromotionDisplayPhase displayPhase;

	@Transient
	private boolean newRecord = false;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getPromoId() {
		return promoId;
	}

	public void setPromoId(Long promoId) {
		this.promoId = promoId;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguageCode() {
		return languageCode;
	}

	public void setLanguageCode(String languageCode) {
		this.languageCode = languageCode;
	}

	public String getReferTo() {
		return referTo;
	}

	public void setReferTo(String referTo) {
		this.referTo = referTo;
	}

	public String getTermsCond() {
		return termsCond;
	}

	public void setTermsCond(String termsCond) {
		this.termsCond = termsCond;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public PromotionDisplayPhase getDisplayPhase() {
		return displayPhase;
	}

	public void setDisplayPhase(PromotionDisplayPhase displayPhase) {
		this.displayPhase = displayPhase;
	}

	public boolean isNewRecord() {
		return newRecord;
	}

	public void setNewRecord(boolean newRecord) {
		this.newRecord = newRecord;
	}
}
