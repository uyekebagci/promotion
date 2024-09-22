package umut.banking.demo.entity.promotion;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */
@Entity
@Table(name = "DFM_PROMO_COUPON_CHANNEL")
public class PromotionCouponChannel extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_Promo_Coupon_Channel_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "CHANNEL", length = 255)
	private String channel;

	@Column(name = "CLIENT_USER_NAME", length = 255)
	private String clientUserName;

	@Column(name = "AIRLINE_CODE", length = 255)
	private String airlineCode;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "PROMO_COUPON_ID")
	private PromotionCoupon promotionCoupon;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public String getClientUserName() {
		return clientUserName;
	}

	public void setClientUserName(String clientUserName) {
		this.clientUserName = clientUserName;
	}

	public String getAirlineCode() {
		return airlineCode;
	}

	public void setAirlineCode(String airlineCode) {
		this.airlineCode = airlineCode;
	}

	public PromotionCoupon getPromotionCoupon() {
		return promotionCoupon;
	}

	public void setPromotionCoupon(PromotionCoupon promotionCoupon) {
		this.promotionCoupon = promotionCoupon;
	}
}
