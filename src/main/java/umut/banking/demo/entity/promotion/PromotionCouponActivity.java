package umut.banking.demo.entity.promotion;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */
@Entity
@Table(name = "DFM_PROMO_COUPON_ACTIVITY")
public class PromotionCouponActivity extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_PROMO_COUPON_ACTIVITY_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "SURNAME")
	private String surName;

	@Column(name = "PNR")
	private String pnr;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROMO_COUPON_ID")
	private PromotionCoupon promotionCoupon;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PROMO_THIRD_PARTY_COUPON_ID")
	private PromotionThirdPartyCoupon promotionThirdPartyCoupon;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getPnr() {
		return pnr;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	public PromotionCoupon getPromotionCoupon() {
		return promotionCoupon;
	}

	public void setPromotionCoupon(PromotionCoupon promotionCoupon) {
		this.promotionCoupon = promotionCoupon;
	}

	public PromotionThirdPartyCoupon getPromotionThirdPartyCoupon() {
		return promotionThirdPartyCoupon;
	}

	public void setPromotionThirdPartyCoupon(PromotionThirdPartyCoupon promotionThirdPartyCoupon) {
		this.promotionThirdPartyCoupon = promotionThirdPartyCoupon;
	}
}
