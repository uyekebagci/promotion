package umut.banking.demo.entity.promotion;


import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;
import umut.banking.demo.entity.enums.PromotionType;

import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "DFM_PROMO")
public class Promotion extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_Promo_SEQ", allocationSize = 1)
	private Long id;

	@Basic(optional = false)
	@NotNull
	@Column(name = "PROMO_CODE")
	private String promotionCode;

	@Column(name = "DESCRIPTION_SUMMARY")
	private String descriptionSummary;
	
	@Column(name = "REQUESTING_DEPARTMENT")
	private String requestingDepartment;

	@Column(name = "PROMO_SOURCE", length = 200)
	private String promoSource;
	
	@Column(name = "PROMOTION_TYPE", length = 200)
	@Enumerated(EnumType.STRING)
	private PromotionType promotionType;

	//undirectional
	@OrderBy("createDate")
	@OneToMany(fetch = FetchType.LAZY, cascade= CascadeType.ALL, orphanRemoval=true)
	@JoinColumn(name="PROMO_ID")
	private List<PromotionDescription> promotionDescriptions = new ArrayList<PromotionDescription>();

	//bidirectional
	@OrderBy("createDate")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotion", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PromotionApplication> promotionApplications = new ArrayList<PromotionApplication>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	public String getDescriptionSummary() {
		return descriptionSummary;
	}

	public void setDescriptionSummary(String descriptionSummary) {
		this.descriptionSummary = descriptionSummary;
	}

	public String getRequestingDepartment() {
		return requestingDepartment;
	}

	public void setRequestingDepartment(String requestingDepartment) {
		this.requestingDepartment = requestingDepartment;
	}

	public String getPromoSource() {
		return promoSource;
	}

	public void setPromoSource(String promoSource) {
		this.promoSource = promoSource;
	}

	public PromotionType getPromotionType() {
		return promotionType;
	}

	public void setPromotionType(PromotionType promotionType) {
		this.promotionType = promotionType;
	}

	public List<PromotionDescription> getPromotionDescriptions() {
		return promotionDescriptions;
	}

	public void setPromotionDescriptions(List<PromotionDescription> promotionDescriptions) {
		this.promotionDescriptions = promotionDescriptions;
	}

	public List<PromotionApplication> getPromotionApplications() {
		return promotionApplications;
	}

	public void setPromotionApplications(List<PromotionApplication> promotionApplications) {
		this.promotionApplications = promotionApplications;
	}
}