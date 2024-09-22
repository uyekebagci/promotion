package umut.banking.demo.entity.promotion;


import jakarta.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "PROMOTION_AIRPORT")
public class PromotionAirport implements Serializable
{
	@Id
	@Column(name = "APT", length = 3)
	private String apt;
	
	@Column(name = "CITY", length = 3)
	private String city;
	
	@Column(name = "CTR", length = 2)
	private String country;
	
	@Column(name = "APT_NAME")
	private String aptName;
	
	@Column(name = "IS_DOMESTIC", length = 8)
	private String isDomestic;
	
	@Column(name = "CITY_NAME")
	private String cityName;
	
	@Column(name = "CTR_NAME")
	private String countryName;
	
	@Column(name = "IS_ARRIVAL_ALLOWED", length = 8)
	private String isArrivalAllowed;
	
	@Column(name = "IS_DEPARTURE_ALLOWED", length = 8)
	private String isDepartureAllowed;
	
	@Column(name = "CALL_CENTER_CODE", length = 8)
	private String callCenterCode;
	
	@Column(name = "CALL_CENTER_MAILTO")
	private String callCenterMailTo;
	
	@Transient
	private Boolean isSelected = new Boolean(false);
	
	@Transient
	private Boolean isSelectedRemove = new Boolean(false);

	public String getApt() {
		return apt;
	}

	public void setApt(String apt) {
		this.apt = apt;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getAptName() {
		return aptName;
	}

	public void setAptName(String aptName) {
		this.aptName = aptName;
	}

	public String getIsDomestic() {
		return isDomestic;
	}

	public void setIsDomestic(String isDomestic) {
		this.isDomestic = isDomestic;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getIsArrivalAllowed() {
		return isArrivalAllowed;
	}

	public void setIsArrivalAllowed(String isArrivalAllowed) {
		this.isArrivalAllowed = isArrivalAllowed;
	}

	public String getIsDepartureAllowed() {
		return isDepartureAllowed;
	}

	public void setIsDepartureAllowed(String isDepartureAllowed) {
		this.isDepartureAllowed = isDepartureAllowed;
	}

	public String getCallCenterCode() {
		return callCenterCode;
	}

	public void setCallCenterCode(String callCenterCode) {
		this.callCenterCode = callCenterCode;
	}

	public String getCallCenterMailTo() {
		return callCenterMailTo;
	}

	public void setCallCenterMailTo(String callCenterMailTo) {
		this.callCenterMailTo = callCenterMailTo;
	}

	public Boolean getSelected() {
		return isSelected;
	}

	public void setSelected(Boolean selected) {
		isSelected = selected;
	}

	public Boolean getSelectedRemove() {
		return isSelectedRemove;
	}

	public void setSelectedRemove(Boolean selectedRemove) {
		isSelectedRemove = selectedRemove;
	}
}
