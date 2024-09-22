package umut.banking.demo.entity.promotion;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_PROMO_APP_TRIP_TYPE")
public class PromotionApplicationTripType extends AbstractModel
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_PROMO_APP_TRPT_SEQ", allocationSize = 1)
	private Long id;
	
	@Column(name = "TRIP_TYPE", length = 20)
	private String tripType;

	@ManyToOne(optional = false)
	@JoinColumn(name = "PROMO_APP_ID")
	private PromotionApplication promotionApplication;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTripType() {
		return tripType;
	}

	public void setTripType(String tripType) {
		this.tripType = tripType;
	}

	public PromotionApplication getPromotionApplication() {
		return promotionApplication;
	}

	public void setPromotionApplication(PromotionApplication promotionApplication) {
		this.promotionApplication = promotionApplication;
	}
}