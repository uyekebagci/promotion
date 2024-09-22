package umut.banking.demo.entity.promotion;

import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;
import umut.banking.demo.entity.enums.PromotionEnum;

import java.util.List;


/**
 * The persistent class for the CORE.DFM_PROMO_COUPON database table.
 * 
 */
@Entity
@Table(name = "DFM_PROMO_THIRD_PARTY_COUPON")
public class PromotionThirdPartyCoupon extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_PROMO_THIRD_PARTY_CPN_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "COUPON_CODE")
	private String couponCode;

	@ManyToOne(optional = false)
	@JoinColumn(name = "PROMO_APP_DETAIL_ID")
	private PromotionApplicationDetail promotionApplicationDetail;

	@Column(name = "USAGE_STATUS", length = 200)
	@Enumerated(EnumType.STRING)
	private PromotionEnum.UsageStatus usageStatus = PromotionEnum.UsageStatus.NOT_USED;

	@OrderBy("createDate")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotionThirdPartyCoupon", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PromotionCouponActivity> promotionCouponActivities;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCouponCode() {
		return couponCode;
	}

	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	public PromotionApplicationDetail getPromotionApplicationDetail() {
		return promotionApplicationDetail;
	}

	public void setPromotionApplicationDetail(PromotionApplicationDetail promotionApplicationDetail) {
		this.promotionApplicationDetail = promotionApplicationDetail;
	}

	public PromotionEnum.UsageStatus getUsageStatus() {
		return usageStatus;
	}

	public void setUsageStatus(PromotionEnum.UsageStatus usageStatus) {
		this.usageStatus = usageStatus;
	}

	public List<PromotionCouponActivity> getPromotionCouponActivities() {
		return promotionCouponActivities;
	}

	public void setPromotionCouponActivities(List<PromotionCouponActivity> promotionCouponActivities) {
		this.promotionCouponActivities = promotionCouponActivities;
	}
}