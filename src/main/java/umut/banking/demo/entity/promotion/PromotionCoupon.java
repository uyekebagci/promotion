package umut.banking.demo.entity.promotion;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import umut.banking.demo.entity.base.AbstractModel;
import jakarta.persistence.*;
import umut.banking.demo.entity.enums.PromotionEnum;

import java.util.Date;
import java.util.List;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_PROMO_COUPON")
public class PromotionCoupon extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	public PromotionCoupon(String couponCode, String isUsed, Date createDate, String createUser, Long usedCount)
	{
		this.couponCode = couponCode;
		this.isUsed = isUsed;
		this.createDate = createDate;
		this.createUser = createUser;
		this.usedCount = usedCount;
	}

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_Promo_Coupon_SEQ", allocationSize = 1)
	private Long id;
	
	@Column(name = "COUPON_CODE", length = 255)
	private String couponCode;

	@Column(name = "IS_USED", length = 255)
	private String isUsed;
	
	@Column(name = "UPDATE_SEQ")
	private Long updateSeq;
	
	@Column(name = "EMD_NO", length = 20)
	private String emdNo;
	
	@Column(name = "MILES_ID", length = 11)
	private String milesId;

	@Column(name = "EXPIRE_DATE")
	@Temporal(TemporalType.DATE)
	private Date expireDate;
	
	@Column(name = "USED_COUNT")
	private Long usedCount;

	@Column(name = "STATUS", length = 200)
	@Enumerated(EnumType.STRING)
	private PromotionEnum.Status status = PromotionEnum.Status.ACTIVE;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "PROMO_APP_DETAIL_ID")
	private PromotionApplicationDetail promotionApplicationDetail;

	@OrderBy("createDate")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "promotionCoupon", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PromotionCouponChannel> promotionCouponChannels;

	@OrderBy("createDate")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany( mappedBy = "promotionCoupon", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PromotionCouponCompensation> promotionCouponCompensations;

	@OrderBy("createDate")
	@LazyCollection(LazyCollectionOption.FALSE)
	@OneToMany(mappedBy = "promotionCoupon", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PromotionCouponActivity> promotionCouponActivities;

	public PromotionCoupon() {

	}

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

	public String getIsUsed() {
		return isUsed;
	}

	public void setIsUsed(String isUsed) {
		this.isUsed = isUsed;
	}

	public Long getUpdateSeq() {
		return updateSeq;
	}

	public void setUpdateSeq(Long updateSeq) {
		this.updateSeq = updateSeq;
	}

	public String getEmdNo() {
		return emdNo;
	}

	public void setEmdNo(String emdNo) {
		this.emdNo = emdNo;
	}

	public String getMilesId() {
		return milesId;
	}

	public void setMilesId(String milesId) {
		this.milesId = milesId;
	}

	public Date getExpireDate() {
		return expireDate;
	}

	public void setExpireDate(Date expireDate) {
		this.expireDate = expireDate;
	}

	public Long getUsedCount() {
		return usedCount;
	}

	public void setUsedCount(Long usedCount) {
		this.usedCount = usedCount;
	}

	public PromotionEnum.Status getStatus() {
		return status;
	}

	public void setStatus(PromotionEnum.Status status) {
		this.status = status;
	}

	public PromotionApplicationDetail getPromotionApplicationDetail() {
		return promotionApplicationDetail;
	}

	public void setPromotionApplicationDetail(PromotionApplicationDetail promotionApplicationDetail) {
		this.promotionApplicationDetail = promotionApplicationDetail;
	}

	public List<PromotionCouponChannel> getPromotionCouponChannels() {
		return promotionCouponChannels;
	}

	public void setPromotionCouponChannels(List<PromotionCouponChannel> promotionCouponChannels) {
		this.promotionCouponChannels = promotionCouponChannels;
	}

	public List<PromotionCouponCompensation> getPromotionCouponCompensations() {
		return promotionCouponCompensations;
	}

	public void setPromotionCouponCompensations(List<PromotionCouponCompensation> promotionCouponCompensations) {
		this.promotionCouponCompensations = promotionCouponCompensations;
	}

	public List<PromotionCouponActivity> getPromotionCouponActivities() {
		return promotionCouponActivities;
	}

	public void setPromotionCouponActivities(List<PromotionCouponActivity> promotionCouponActivities) {
		this.promotionCouponActivities = promotionCouponActivities;
	}
}
