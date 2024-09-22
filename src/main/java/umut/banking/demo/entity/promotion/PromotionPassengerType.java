package umut.banking.demo.entity.promotion;

import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;

@Entity
@Table(name = "DFM_PROMO_PAX_TYPE")
public class PromotionPassengerType extends AbstractModel
{
	@Id
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "PAX_CODE")
	private String paxCode;
	
	@Column(name = "DEFAULT_PAX_NAME")
	private String defaultPaxName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPaxCode() {
		return paxCode;
	}

	public void setPaxCode(String paxCode) {
		this.paxCode = paxCode;
	}

	public String getDefaultPaxName() {
		return defaultPaxName;
	}

	public void setDefaultPaxName(String defaultPaxName) {
		this.defaultPaxName = defaultPaxName;
	}
}
