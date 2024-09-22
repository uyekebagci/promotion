package umut.banking.demo.entity.promotion;


import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;
import umut.banking.demo.entity.enums.PromotionEnum;

import java.util.Date;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_PROMO_COUPON_CMPNST")
public class PromotionCouponCompensation extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "CORE.DFM_PROMO_COUPON_CMPNST_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "SURNAME")
	private String surName;

	@Column(name = "APPROVAL_CODE")
	private String approvalCode;

	@Column(name = "SALES_BEGIN_DATE")
	@Temporal(TemporalType.DATE)
	private Date salesBeginDate;

	@Column(name = "SALES_END_DATE")
	@Temporal(TemporalType.DATE)
	private Date salesEndDate;

	@Column(name = "FLIGHT_BEGIN_DATE")
	@Temporal(TemporalType.DATE)
	private Date flightBeginDate;

	@Column(name = "FLIGHT_END_DATE")
	@Temporal(TemporalType.DATE)
	private Date flightEndDate;

	@Column(name = "USAGE_STATUS", length = 200)
	@Enumerated(EnumType.STRING)
	private PromotionEnum.CompensationCouponUsageStatus usageStatus = PromotionEnum.CompensationCouponUsageStatus.NOT_USED;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "PROMO_COUPON_ID")
	private PromotionCoupon promotionCoupon;

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

	public String getApprovalCode() {
		return approvalCode;
	}

	public void setApprovalCode(String approvalCode) {
		this.approvalCode = approvalCode;
	}

	public Date getSalesBeginDate() {
		return salesBeginDate;
	}

	public void setSalesBeginDate(Date salesBeginDate) {
		this.salesBeginDate = salesBeginDate;
	}

	public Date getSalesEndDate() {
		return salesEndDate;
	}

	public void setSalesEndDate(Date salesEndDate) {
		this.salesEndDate = salesEndDate;
	}

	public Date getFlightBeginDate() {
		return flightBeginDate;
	}

	public void setFlightBeginDate(Date flightBeginDate) {
		this.flightBeginDate = flightBeginDate;
	}

	public Date getFlightEndDate() {
		return flightEndDate;
	}

	public void setFlightEndDate(Date flightEndDate) {
		this.flightEndDate = flightEndDate;
	}

	public PromotionEnum.CompensationCouponUsageStatus getUsageStatus() {
		return usageStatus;
	}

	public void setUsageStatus(PromotionEnum.CompensationCouponUsageStatus usageStatus) {
		this.usageStatus = usageStatus;
	}

	public PromotionCoupon getPromotionCoupon() {
		return promotionCoupon;
	}

	public void setPromotionCoupon(PromotionCoupon promotionCoupon) {
		this.promotionCoupon = promotionCoupon;
	}
}
