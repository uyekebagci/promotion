package umut.banking.demo.entity.promotion;


import umut.banking.demo.utils.CalendarUtils;

import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;
import umut.banking.demo.utils.StringUtils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_PROMO_APP_DET")
public class PromotionApplicationDetail extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_Promo_App_Det_SEQ", allocationSize = 1)
	private Long id;

	@Column(name = "CHANNEL_CODE", length = 255)
	private String channelCode;

	@Column(name = "SALE_BEGIN_DATE")
	@Temporal(TemporalType.DATE)
	private Date saleBeginDate;

	@Column(name = "SALE_END_DATE")
	@Temporal(TemporalType.DATE)
	private Date saleEndDate;

	@Column(name = "COMPANY_CODE", length = 255)
	private String companyCode;

	@Column(name = "FORWARD_FLIGHT_BEGIN_DATE")
	@Temporal(TemporalType.DATE)
	private Date forwardFlightBeginDate;

	@Column(name = "FORWARD_FLIGHT_END_DATE")
	@Temporal(TemporalType.DATE)
	private Date forwardFlightEndDate;

	@Column(name = "BACKWARD_FLIGHT_BEGIN_DATE")
	@Temporal(TemporalType.DATE)
	private Date backwardFlightBeginDate;

	@Column(name = "BACKWARD_FLIGHT_END_DATE")
	@Temporal(TemporalType.DATE)
	private Date backwardFlightEndDate;

	@Column(name = "EVENT_BEGIN_DATE")
	@Temporal(TemporalType.DATE)
	private Date eventBeginDate;

	@Column(name = "EVENT_END_DATE")
	@Temporal(TemporalType.DATE)
	private Date eventEndDate;

	@Column(name = "IS_DOMESTIC")
	private Boolean isDomestic;

	@Column(name = "SALE_BEGIN_TIME")
	private String saleBeginTime;

	@Column(name = "SALE_END_TIME")
	private String saleEndTime;

	@Transient
	public Date saleEndTimeWithDate;

	@Transient
	public Date saleBeginTimeWithDate;
	@ManyToOne(optional = false,fetch = FetchType.LAZY)

	@Transient
	public String promotionCode;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "PROMO_APP_ID")
	private PromotionApplication promotionApplication;

	@OrderBy("createDate")
	@OneToMany(mappedBy = "promotionApplicationDetail", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
	private List<PromotionCoupon> promotionCoupon = new ArrayList<PromotionCoupon>();

	@OrderBy("createDate")
	@OneToMany(mappedBy = "promotionApplicationDetail", cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.LAZY)
	private List<PromotionThirdPartyCoupon> promotionThirdPartyCoupons;


	@Transient
	private boolean newRecord;

	@Transient
	private Boolean isInternational;


	public String getPromotionCode() {
		return promotionCode;
	}

	public void setPromotionCode(String promotionCode) {
		this.promotionCode = promotionCode;
	}

	public Date getSaleBeginTimeWithDate()
	{
		if (StringUtils.isNotBlank(this.saleBeginTime))
		{
			this.saleBeginTimeWithDate = CalendarUtils.stringToDate(this.saleBeginTime , "HH:mm");
		}
		return saleBeginTimeWithDate;
	}

	public void setSaleBeginTimeWithDate(Date saleBeginTimeWithDate)
	{
		this.saleBeginTime = saleBeginTimeWithDate != null ? CalendarUtils.dateToString(saleBeginTimeWithDate, new SimpleDateFormat("HH:mm")) : null;
		this.saleBeginTimeWithDate = saleBeginTimeWithDate;
	}

	public Date getSaleEndTimeWithDate()
	{
		if (StringUtils.isNotBlank(this.saleEndTime))
		{
			this.saleBeginTimeWithDate = CalendarUtils.stringToDate(this.saleEndTime, "HH:mm");
		}
		return saleBeginTimeWithDate;
	}

	public void setSaleEndTimeWithDate(Date saleEndTimeWithDate)
	{
		this.saleEndTime = saleEndTimeWithDate != null ? CalendarUtils.dateToString(saleEndTimeWithDate, new SimpleDateFormat("HH:mm")) : null;
		this.saleEndTimeWithDate = saleEndTimeWithDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public Date getSaleBeginDate() {
		return saleBeginDate;
	}

	public void setSaleBeginDate(Date saleBeginDate) {
		this.saleBeginDate = saleBeginDate;
	}

	public Date getSaleEndDate() {
		return saleEndDate;
	}

	public void setSaleEndDate(Date saleEndDate) {
		this.saleEndDate = saleEndDate;
	}

	public String getCompanyCode() {
		return companyCode;
	}

	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}

	public Date getForwardFlightBeginDate() {
		return forwardFlightBeginDate;
	}

	public void setForwardFlightBeginDate(Date forwardFlightBeginDate) {
		this.forwardFlightBeginDate = forwardFlightBeginDate;
	}

	public Date getForwardFlightEndDate() {
		return forwardFlightEndDate;
	}

	public void setForwardFlightEndDate(Date forwardFlightEndDate) {
		this.forwardFlightEndDate = forwardFlightEndDate;
	}

	public Date getBackwardFlightBeginDate() {
		return backwardFlightBeginDate;
	}

	public void setBackwardFlightBeginDate(Date backwardFlightBeginDate) {
		this.backwardFlightBeginDate = backwardFlightBeginDate;
	}

	public Date getBackwardFlightEndDate() {
		return backwardFlightEndDate;
	}

	public void setBackwardFlightEndDate(Date backwardFlightEndDate) {
		this.backwardFlightEndDate = backwardFlightEndDate;
	}

	public Date getEventBeginDate() {
		return eventBeginDate;
	}

	public void setEventBeginDate(Date eventBeginDate) {
		this.eventBeginDate = eventBeginDate;
	}

	public Date getEventEndDate() {
		return eventEndDate;
	}

	public void setEventEndDate(Date eventEndDate) {
		this.eventEndDate = eventEndDate;
	}

	public Boolean getIsDomestic() {
		return isDomestic;
	}

	public void setIsDomestic(Boolean domestic) {
		isDomestic = domestic;
	}

	public Boolean getInternational() {
		return isInternational;
	}

	public void setInternational(Boolean international) {
		isInternational = international;
	}

	public String getSaleBeginTime() {
		return saleBeginTime;
	}

	public void setSaleBeginTime(String saleBeginTime) {
		this.saleBeginTime = saleBeginTime;
	}

	public String getSaleEndTime() {
		return saleEndTime;
	}

	public void setSaleEndTime(String saleEndTime) {
		this.saleEndTime = saleEndTime;
	}

	public PromotionApplication getPromotionApplication() {
		return promotionApplication;
	}

	public void setPromotionApplication(PromotionApplication promotionApplication) {
		this.promotionApplication = promotionApplication;
	}

	public List<PromotionCoupon> getPromotionCoupon() {
		return promotionCoupon;
	}

	public void setPromotionCoupon(List<PromotionCoupon> promotionCoupon) {
		this.promotionCoupon = promotionCoupon;
	}

	public List<PromotionThirdPartyCoupon> getPromotionThirdPartyCoupons() {
		return promotionThirdPartyCoupons;
	}

	public void setPromotionThirdPartyCoupons(List<PromotionThirdPartyCoupon> promotionThirdPartyCoupons) {
		this.promotionThirdPartyCoupons = promotionThirdPartyCoupons;
	}

	public boolean isNewRecord() {
		return newRecord;
	}

	public void setNewRecord(boolean newRecord) {
		this.newRecord = newRecord;
	}


}