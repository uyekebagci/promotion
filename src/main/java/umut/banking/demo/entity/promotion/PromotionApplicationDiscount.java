package umut.banking.demo.entity.promotion;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;


/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_PROMO_APP_DISCOUNT")
public class PromotionApplicationDiscount extends AbstractModel
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_PROMO_APP_DISC_SEQ", allocationSize = 1)
	private Long id;
	
	@Column(name = "FARE_CLASS", length = 10)
	private String fareClass;
	
	@Column(name = "DISCOUNT_PERCENTAGE", columnDefinition="NUMBER(19)")
	private Double discountPercentage;
	
	@Column(name = "IS_DOMESTIC")
	private Boolean isDomestic;

	@ManyToOne(optional = false)
	@JoinColumn(name = "PROMO_APP_ID")
	private PromotionApplication promotionApplication;

	@Transient
	private boolean newRecord;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFareClass() {
		return fareClass;
	}

	public void setFareClass(String fareClass) {
		this.fareClass = fareClass;
	}

	public Double getDiscountPercentage() {
		return discountPercentage;
	}

	public void setDiscountPercentage(Double discountPercentage) {
		this.discountPercentage = discountPercentage;
	}

	public Boolean getIsDomestic() {
		return isDomestic;
	}

	public void setIsDomestic(Boolean domestic) {
		isDomestic = domestic;
	}

	public PromotionApplication getPromotionApplication() {
		return promotionApplication;
	}

	public void setPromotionApplication(PromotionApplication promotionApplication) {
		this.promotionApplication = promotionApplication;
	}

	public boolean isNewRecord() {
		return newRecord;
	}

	public void setNewRecord(boolean newRecord) {
		this.newRecord = newRecord;
	}
}