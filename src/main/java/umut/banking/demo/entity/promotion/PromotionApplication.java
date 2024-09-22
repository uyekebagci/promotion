package umut.banking.demo.entity.promotion;

import jakarta.persistence.*;
import umut.banking.demo.entity.base.AbstractModel;
import umut.banking.demo.entity.definition.LookUpPaymentTypeGroups;
import umut.banking.demo.entity.enums.PromotionEnum;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by INNGKISAKOL on 7/31/2017.
 */

@Entity
@Table(name = "DFM_PROMO_APP")
public class PromotionApplication extends AbstractModel
{
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEQ")
	@SequenceGenerator(name = "SEQ", sequenceName = "DFM_Promo_App_SEQ", allocationSize = 1, initialValue = 1)
	private Long id;

	@Column(name = "ACCOUNT_CODE", length = 255)
	private String accountCode;

	@Column(name = "IS_COUPON_REQ")
	private Boolean isCouponRequired;

	@Column(name = "MAX_USAGE_PER_COUPON")
	private Integer maximumUsagePerCoupon;

	@Column(name = "MS_REQUIRED")
	private Boolean isMilesAndSmilesRequired;

	@Column(name = "IS_BIN_SPECIFY_REQ")
	private Boolean isBinSpecifyRequired;

	@Column(name = "BIN_SPECIFY", length = 2000)
	private String binSpecify;

	@Column(name = "USAGE_LIMIT")
	private Integer maximumUsage;

	@Column(name = "MIN_STAY_DAY")
	private Integer minStayDay;

	@Column(name = "MAX_STAY_DAY")
	private Integer maxStayDay;

	@Column(name = "MAX_PASSENGER_COUNT", scale = 0, precision = 2)
	private Integer maxPassengerCount;

	@Column(name = "MIN_PASSENGER_COUNT", scale = 0, precision = 2)
	private Integer minimumPassengerCount;

	@Column(name = "SURNAME_CHECK")
	private Boolean surnameCheck;

	@Column(name = "STATUS")
	private String status;

	@Column(name = "IS_FOR_PRIVATE_PASSENGER")
	private Boolean isForPrivatePassenger;

	@Column(name = "BLACK_LIST")
	private Boolean blackList;

	@Column(name = "TOUR_CODE")
	private String tourCode;

	@Column(name = "THIRD_PARTY_COMPANY")
	private String thirdPartyCompanyName;

	@Column(name = "CONTRACT_ID")
	private String contractId;

	@Column(name = "IS_COUPON_CODE_DATE_REQ")
	private Boolean isCouponCodeDateRequired;

	@Column(name = "TICKETING_OPTION_DAY", scale = 0, precision = 2)
	private Integer ticketingOptionDay;

	@Column(name = "TRAVELLING_OPTION_DAY", scale = 0, precision = 2)
	private Integer travellingOptionDay;

	@Enumerated(EnumType.STRING)
	@Column(name = "CAMPAIGN")
	private PromotionEnum.Answer companion = PromotionEnum.Answer.NO;

	@Enumerated(EnumType.STRING)
	@Column(name = "MAIL_CHECK")
	private PromotionEnum.Answer mailCheck = PromotionEnum.Answer.NO;

	@ManyToOne(optional = false)
	@JoinColumn(name = "PROMO_ID")
	private Promotion promotion;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "PAYMENT_TYPE_GRP_ID")
	private LookUpPaymentTypeGroups lookUpPaymentTypeGroups;

	@OrderBy("createDate")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotionApplication", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PromotionApplicationDetail> applicationDetails = new ArrayList<PromotionApplicationDetail>();

	@OrderBy("createDate")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotionApplication", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PromotionApplicationDiscount> applicationDiscounts = new ArrayList<PromotionApplicationDiscount>();

	@OrderBy("createDate")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotionApplication", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PromotionApplicationPort> applicationPorts = new ArrayList<PromotionApplicationPort>();

	@OrderBy("createDate")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotionApplication", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PromotionApplicationTripType> applicationTripTypes = new ArrayList<PromotionApplicationTripType>();

	@OrderBy("createDate")
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "promotionApplication", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<PromotionApplicationPassengerType> applicationPassengerTypes = new ArrayList<PromotionApplicationPassengerType>();

	@OneToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "DFM_PROMO_CARD_TYPES",joinColumns =  @JoinColumn(name = "PROMO_DESCRIPTION_ID"), inverseJoinColumns = @JoinColumn(name="CARD_TYPE_ID"))
	private List<PromotionParameterDefinition> msCardTypes = new ArrayList<PromotionParameterDefinition>();

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "DFM_PROMO_APP_PROMO_MAIL", joinColumns = @JoinColumn(name = "PROMO_APP_ID"), inverseJoinColumns = @JoinColumn(name = "PROMO_APP_MAIL_ID"))
	private List<PromotionApplicationMail> promotionAppMails = new ArrayList<PromotionApplicationMail>();

	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "promotionApplication", orphanRemoval = true)
	private PromotionApplicationAddition promotionApplicationAddition = new PromotionApplicationAddition();


	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "promotionApplication", orphanRemoval = true)
	private PromotionAdditionalDefinition promotionAdditionalDefinition = new PromotionAdditionalDefinition();

	@Transient
	private List<PromotionParameterDefinition> msCardTypesAsList;

	public List<PromotionParameterDefinition> getMsCardTypesAsList()
	{

		return getMsCardTypes();
	}

	public void setMsCardTypesAsList(List<PromotionParameterDefinition> msCardTypesAsList)
	{
		this.msCardTypes = msCardTypesAsList;
	}

	public PromotionAdditionalDefinition getPromotionAdditionalDefinition()
	{
		if (promotionAdditionalDefinition == null)
		{
			return new PromotionAdditionalDefinition();
		}
		return promotionAdditionalDefinition;
	}

	public PromotionApplicationAddition getPromotionApplicationAddition()
	{
		if (promotionApplicationAddition == null)
		{
			promotionApplicationAddition = new PromotionApplicationAddition();
		}
		return promotionApplicationAddition;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAccountCode() {
		return accountCode;
	}

	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}

	public Boolean getIsCouponRequired() {
		return isCouponRequired;
	}

	public void setIsCouponRequired(Boolean couponRequired) {
		isCouponRequired = couponRequired;
	}

	public Integer getMaximumUsagePerCoupon() {
		return maximumUsagePerCoupon;
	}

	public void setMaximumUsagePerCoupon(Integer maximumUsagePerCoupon) {
		this.maximumUsagePerCoupon = maximumUsagePerCoupon;
	}

	public Boolean getIsMilesAndSmilesRequired() {
		return isMilesAndSmilesRequired;
	}

	public void setIsMilesAndSmilesRequired(Boolean milesAndSmilesRequired) {
		isMilesAndSmilesRequired = milesAndSmilesRequired;
	}

	public Boolean getIsBinSpecifyRequired() {
		return isBinSpecifyRequired;
	}

	public void setIsBinSpecifyRequired(Boolean binSpecifyRequired) {
		isBinSpecifyRequired = binSpecifyRequired;
	}

	public String getBinSpecify() {
		return binSpecify;
	}

	public void setBinSpecify(String binSpecify) {
		this.binSpecify = binSpecify;
	}

	public Integer getMaximumUsage() {
		return maximumUsage;
	}

	public void setMaximumUsage(Integer maximumUsage) {
		this.maximumUsage = maximumUsage;
	}

	public Integer getMinStayDay() {
		return minStayDay;
	}

	public void setMinStayDay(Integer minStayDay) {
		this.minStayDay = minStayDay;
	}

	public Integer getMaxStayDay() {
		return maxStayDay;
	}

	public void setMaxStayDay(Integer maxStayDay) {
		this.maxStayDay = maxStayDay;
	}

	public Integer getMaxPassengerCount() {
		return maxPassengerCount;
	}

	public void setMaxPassengerCount(Integer maxPassengerCount) {
		this.maxPassengerCount = maxPassengerCount;
	}

	public Integer getMinimumPassengerCount() {
		return minimumPassengerCount;
	}

	public void setMinimumPassengerCount(Integer minimumPassengerCount) {
		this.minimumPassengerCount = minimumPassengerCount;
	}

	public Boolean getSurnameCheck() {
		return surnameCheck;
	}

	public void setSurnameCheck(Boolean surnameCheck) {
		this.surnameCheck = surnameCheck;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Boolean getIsForPrivatePassenger() {
		return isForPrivatePassenger;
	}

	public void setIsForPrivatePassenger(Boolean forPrivatePassenger) {
		isForPrivatePassenger = forPrivatePassenger;
	}

	public Boolean getBlackList() {
		return blackList;
	}

	public void setBlackList(Boolean blackList) {
		this.blackList = blackList;
	}

	public String getTourCode() {
		return tourCode;
	}

	public void setTourCode(String tourCode) {
		this.tourCode = tourCode;
	}

	public String getThirdPartyCompanyName() {
		return thirdPartyCompanyName;
	}

	public void setThirdPartyCompanyName(String thirdPartyCompanyName) {
		this.thirdPartyCompanyName = thirdPartyCompanyName;
	}

	public String getContractId() {
		return contractId;
	}

	public void setContractId(String contractId) {
		this.contractId = contractId;
	}

	public Boolean getIsCouponCodeDateRequired() {
		return isCouponCodeDateRequired;
	}

	public void setIsCouponCodeDateRequired(Boolean isCouponCodeDateRequired) {
		this.isCouponCodeDateRequired = isCouponCodeDateRequired;
	}

	public Integer getTicketingOptionDay() {
		return ticketingOptionDay;
	}

	public void setTicketingOptionDay(Integer ticketingOptionDay) {
		this.ticketingOptionDay = ticketingOptionDay;
	}

	public Integer getTravellingOptionDay() {
		return travellingOptionDay;
	}

	public void setTravellingOptionDay(Integer travellingOptionDay) {
		this.travellingOptionDay = travellingOptionDay;
	}

	public PromotionEnum.Answer getCompanion() {
		return companion;
	}

	public void setCompanion(PromotionEnum.Answer companion) {
		this.companion = companion;
	}

	public PromotionEnum.Answer getMailCheck() {
		return mailCheck;
	}

	public void setMailCheck(PromotionEnum.Answer mailCheck) {
		this.mailCheck = mailCheck;
	}

	public Promotion getPromotion() {
		return promotion;
	}

	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public LookUpPaymentTypeGroups getLookUpPaymentTypeGroups() {
		return lookUpPaymentTypeGroups;
	}

	public void setLookUpPaymentTypeGroups(LookUpPaymentTypeGroups lookUpPaymentTypeGroups) {
		this.lookUpPaymentTypeGroups = lookUpPaymentTypeGroups;
	}

	public List<PromotionApplicationDetail> getApplicationDetails() {
		return applicationDetails;
	}

	public void setApplicationDetails(List<PromotionApplicationDetail> applicationDetails) {
		this.applicationDetails = applicationDetails;
	}

	public List<PromotionApplicationDiscount> getApplicationDiscounts() {
		return applicationDiscounts;
	}

	public void setApplicationDiscounts(List<PromotionApplicationDiscount> applicationDiscounts) {
		this.applicationDiscounts = applicationDiscounts;
	}

	public List<PromotionApplicationPort> getApplicationPorts() {
		return applicationPorts;
	}

	public void setApplicationPorts(List<PromotionApplicationPort> applicationPorts) {
		this.applicationPorts = applicationPorts;
	}

	public List<PromotionApplicationTripType> getApplicationTripTypes() {
		return applicationTripTypes;
	}

	public void setApplicationTripTypes(List<PromotionApplicationTripType> applicationTripTypes) {
		this.applicationTripTypes = applicationTripTypes;
	}

	public List<PromotionApplicationPassengerType> getApplicationPassengerTypes() {
		return applicationPassengerTypes;
	}

	public void setApplicationPassengerTypes(List<PromotionApplicationPassengerType> applicationPassengerTypes) {
		this.applicationPassengerTypes = applicationPassengerTypes;
	}

	public List<PromotionParameterDefinition> getMsCardTypes() {
		return msCardTypes;
	}

	public void setMsCardTypes(List<PromotionParameterDefinition> msCardTypes) {
		this.msCardTypes = msCardTypes;
	}

	public List<PromotionApplicationMail> getPromotionAppMails() {
		return promotionAppMails;
	}

	public void setPromotionAppMails(List<PromotionApplicationMail> promotionAppMails) {
		this.promotionAppMails = promotionAppMails;
	}

	public void setPromotionApplicationAddition(PromotionApplicationAddition promotionApplicationAddition) {
		this.promotionApplicationAddition = promotionApplicationAddition;
	}

	public void setPromotionAdditionalDefinition(PromotionAdditionalDefinition promotionAdditionalDefinition) {
		this.promotionAdditionalDefinition = promotionAdditionalDefinition;
	}
}
