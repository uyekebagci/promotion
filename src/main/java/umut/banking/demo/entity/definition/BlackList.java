package umut.banking.demo.entity.definition;


import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;
import umut.banking.demo.entity.enums.PromotionEnum;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_BLACK_LIST")
public class BlackList extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_BLACK_LIST_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "FFP_ID")
	private String ffpId;

	@Enumerated(EnumType.STRING)
	@Column(name = "BLACK_LIST_TYPE")
	private PromotionEnum.BlackListType blackListType = PromotionEnum.BlackListType.GLOBAL;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "PROMO_CODE")
	private String promotionCode;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFfpId() {
		return ffpId;
	}

	public void setFfpId(String ffpId) {
		this.ffpId = ffpId;
	}

	public PromotionEnum.BlackListType getBlackListType() {
		return blackListType;
	}

	public void setBlackListType(PromotionEnum.BlackListType blackListType) {
		this.blackListType = blackListType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}
}
