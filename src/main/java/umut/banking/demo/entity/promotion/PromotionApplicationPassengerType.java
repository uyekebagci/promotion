package umut.banking.demo.entity.promotion;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */
@Entity
@Table(name = "DFM_PROMO_APP_PASSENGER_TYPE")
public class PromotionApplicationPassengerType extends AbstractModel
{
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_PROMO_APP_PSGR_SEQ", allocationSize = 1)
	private Long id;
	
	@Column(name = "PASSENGER_TYPE", length = 20)
	private String passengerType;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "PROMO_APP_ID")
	private PromotionApplication promotionApplication;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPassengerType() {
		return passengerType;
	}

	public void setPassengerType(String passengerType) {
		this.passengerType = passengerType;
	}

	public PromotionApplication getPromotionApplication() {
		return promotionApplication;
	}

	public void setPromotionApplication(PromotionApplication promotionApplication) {
		this.promotionApplication = promotionApplication;
	}
}